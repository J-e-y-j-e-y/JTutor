Система сортировки

1. Создай интерфейс Sortable 
   - с методом int compareTo(Sortable other).
2. Создай классы, которые реализуют интерфейс Sortable: 
   - Person (с полями firstName, lastName), 
   - Product (с полями name, price), 
   - Task (с полями priority, dueDate).
3. Реализуй compareTo в каждом классе, обеспечивая разные критерии сортировки:
   - Person - по фамилии, затем по имени.
   - Product - по цене.
   - Task - по приоритету, затем по дате.
4. Создайте класс Sorter 
   - с методом void sort(List<Sortable> list), который принимает список объектов, реализующих интерфейс Sortable, и сортирует их, используя метод compareTo
   - нужно реализовать сортировку, например, [пузырьковую](https://javarush.com/groups/posts/634-realizacija-puzihrjhkovoy-sortirovki-na-java)(https://javarush.com/groups/posts/634-realizacija-puzihrjhkovoy-sortirovki-na-java)
5. Продемонстрируй использование полиморфизма и параметризации при вызове метода sort с разными типами объектов
6. Почитай про интерфейс Comparable ([тут](https://www.baeldung.com/java-comparator-comparable)https://www.baeldung.com/java-comparator-comparable)
7. Реализуй сортировку классов с его помощью