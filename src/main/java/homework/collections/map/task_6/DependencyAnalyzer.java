package homework.collections.map.task_6;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DependencyAnalyzer {
    private static final String JAVA_FILE_EXTENSION = ".java";

    /**
     * Анализирует зависимости между классами в заданном каталоге.
     *
     * @param directoryPath Путь к каталогу с Java-файлами.
     * @return Map<String, Set < String>> Карта зависимостей: имя класса -> множество имен классов, от которых зависит.
     */
    public Map<String, Set<String>> analyzeDependencies(String directoryPath) throws IOException {
        Map<String, Set<String>> dependencies = new HashMap<>();

        List<File> javaFiles = Files.walk(Paths.get(directoryPath))
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(JAVA_FILE_EXTENSION))
                .map(Path::toFile)
                .collect(Collectors.toList());

        for (File javaFile : javaFiles) {
            try {
                JavaParser javaParser = new JavaParser();
                ParseResult<CompilationUnit> parseResult = javaParser.parse(javaFile);

                if (parseResult.isSuccessful() && parseResult.getResult().isPresent()) {
                    CompilationUnit compilationUnit = parseResult.getResult().get();

                    // Получаем имя пакета (если есть)
                    String packageName = compilationUnit.getPackageDeclaration()
                            .map(PackageDeclaration::getNameAsString)
                            .orElse("");

                    // Находим все объявления классов и интерфейсов в файле
                    compilationUnit.findAll(ClassOrInterfaceDeclaration.class).forEach(classOrInterface -> {
                        String className = packageName.isEmpty() ? classOrInterface.getNameAsString()
                                : packageName + "." + classOrInterface.getNameAsString();

                        // Создаем множество для хранения зависимостей текущего класса
                        Set<String> classDependencies = new HashSet<>();

                        // Находим все импорты в файле и добавляем их в зависимости
                        compilationUnit.getImports().forEach(importDeclaration -> {
                            classDependencies.add(importDeclaration.getNameAsString()); // Добавляем полные имена импортированных классов
                        });

                        dependencies.put(className, classDependencies);
                    });
                } else {
                    System.err.println("Ошибка парсинга файла: " + javaFile.getAbsolutePath());
                    if (parseResult.getProblems() != null) {
                        parseResult.getProblems().forEach(System.err::println);
                    }
                }
            } catch (Exception e) {
                System.err.println("Неожиданная ошибка при обработке файла: " + javaFile.getAbsolutePath());
                e.printStackTrace();
            }
        }

        return dependencies;
    }

    /**
     * Находит классы, которые не имеют зависимостей (корневые классы).
     *
     * @param dependencies Карта зависимостей.
     * @return Set<String> Множество имен корневых классов.
     */
    public Set<String> findRootClasses(Map<String, Set<String>> dependencies) {
        Set<String> rootClasses = new HashSet<>(dependencies.keySet());
        for (Set<String> dependentClasses : dependencies.values()) {
            rootClasses.removeAll(dependentClasses);
        }
        return rootClasses;
    }

    /**
     * Находит классы, от которых никто не зависит (листовые классы).
     *
     * @param dependencies Карта зависимостей.
     * @return Set<String> Множество имен листовых классов.
     */
    public Set<String> findLeafClasses(Map<String, Set<String>> dependencies) {
        Set<String> allDependentClasses = dependencies.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        Set<String> leafClasses = new HashSet<>(dependencies.keySet());
        leafClasses.retainAll(dependencies.keySet()); // Убедимся, что класс существует в dependencies
        leafClasses.removeAll(allDependentClasses);

        return leafClasses;
    }

    /**
     * Находит циклические зависимости.
     *
     * @param dependencies Карта зависимостей.
     * @return Set<List < String>> Множество списков, представляющих циклические зависимости.
     */
    public Set<List<String>> findCyclicDependencies(Map<String, Set<String>> dependencies) {
        Set<List<String>> cyclicDependencies = new HashSet<>();
        Set<String> visited = new HashSet<>();
        Set<String> recursionStack = new HashSet<>();

        for (String className : dependencies.keySet()) {
            findCyclicDependenciesUtil(className, dependencies, visited, recursionStack, new ArrayList<>(), cyclicDependencies);
        }

        return cyclicDependencies;
    }

    private void findCyclicDependenciesUtil(String className, Map<String, Set<String>> dependencies, Set<String> visited, Set<String> recursionStack, List<String> path, Set<List<String>> cyclicDependencies) {
        visited.add(className);
        recursionStack.add(className);
        path.add(className);

        Set<String> dependentClasses = dependencies.get(className);
        if (dependentClasses != null) {
            for (String dependentClass : dependentClasses) {
                if (!visited.contains(dependentClass)) {
                    findCyclicDependenciesUtil(dependentClass, dependencies, visited, recursionStack, new ArrayList<>(path), cyclicDependencies);
                } else if (recursionStack.contains(dependentClass)) {
                    // Найден цикл
                    List<String> cycle = new ArrayList<>(path.subList(path.indexOf(dependentClass), path.size()));
                    cycle.add(dependentClass); // Замыкаем цикл
                    cyclicDependencies.add(cycle);
                }
            }
        }

        recursionStack.remove(className);
    }

    public static void main(String[] args) throws IOException {
        String directoryPath = "./src"; // Замените на путь к вашему Java-проекту
        DependencyAnalyzer analyzer = new DependencyAnalyzer();

        Map<String, Set<String>> dependencies = analyzer.analyzeDependencies(directoryPath);

        System.out.println("Зависимости:");
        dependencies.forEach((className, dependentClasses) -> {
            System.out.println("  " + className + " -> " + dependentClasses);
        });

        Set<String> rootClasses = analyzer.findRootClasses(dependencies);
        System.out.println("\nКорневые классы (не имеют зависимостей): " + rootClasses);

        Set<String> leafClasses = analyzer.findLeafClasses(dependencies);
        System.out.println("\nЛистовые классы (от которых никто не зависит): " + leafClasses);

        Set<List<String>> cyclicDependencies = analyzer.findCyclicDependencies(dependencies);
        System.out.println("\nЦиклические зависимости: " + cyclicDependencies);
    }
}
