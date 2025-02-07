package lessons.oop.work_with_string_examples.ex1_basics;

import java.util.*;
import java.util.stream.Collectors;

public class StringBasicsExample {
    public static void main(String[] args) {
        concatenateStrings();
        formatString();
        joinStrings();
        splitStrings();
        stringTokenizer();
    }

    public static void concatenateStrings() {
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder(100);

        stringBuilder.append("Baeldung");
        stringBuilder.append(" is");
        stringBuilder.append(" awesome");

        System.out.println(stringBuilder.toString());

        // Оператор сложения
        String myString = "The " + "quick " + "brown " + "fox...";
        System.out.println(myString);

        // Методы String
        String myString2 = "Both".concat(" fickle")
                .concat(" dwarves")
                .concat(" jinx")
                .concat(" my")
                .concat(" pig")
                .concat(" quiz");
        System.out.println(myString2);
    }

    public static void formatString() {
        String myString = String.format("%s %s %.2f %s %s, %s...", "I",
                "ate",
                2.5056302,
                "blueberry",
                "pies",
                "oops");
        System.out.println(myString);
    }

    public static void joinStrings() {
        // String.join (Java 8+)
        String[] strings = {"I'm", "running", "out", "of", "pangrams!"};
        String myString = String.join(" ", strings);
        System.out.println(myString);

        // StringJoiner (Java 8+)
        StringJoiner fruitJoiner = new StringJoiner(", ");

        fruitJoiner.add("Apples");
        fruitJoiner.add("Oranges");
        fruitJoiner.add("Bananas");
        System.out.println(fruitJoiner.toString());

        // Arrays.toString
        String[] myFavouriteLanguages = {"Java", "JavaScript", "Python"};
        String toString = Arrays.toString(myFavouriteLanguages);
        System.out.println(toString);

        // Collectors.joining (Java 8+)
        List<String> awesomeAnimals = Arrays.asList("Shark", "Panda", "Armadillo");
        String animalString = awesomeAnimals.stream().collect(Collectors.joining(", "));
        System.out.println(animalString);
    }

    public static void splitStrings() {
        String[] splitted = "peter,james,thomas".split(",");

        String[] splitted2 = "car jeep scooter".split(" ");

        String[] splitted3 = "192.168.1.178".split("\\.");

        String[] splitted4 = "b a, e, l.d u, n g".split("\\s+|,\\s*|\\.\\s*");
    }

    public static void stringTokenizer() {
        String str = "example, string, has, five, words";
        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
