package main.java.homework.oop.classes_homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class TestReader {

    public static void main(String[] args) {

        List<Book> PetrovBooks = new ArrayList<>();
        List<Book> IvanovBooks = new ArrayList<>();

        Reader petrov = new Reader("Петров В. В.", 1, "Факультет Кибернетики", "21.02.2000", "+7555435465");
        Reader ivanov = new Reader("Иванов И. И.", 2, "Факультет Ботаники", "12.03.2002", "+7333875632");

        Book book1 = new Book("Приключения", "Беляев А. Р.", 2005, 12444);
        Book book2 = new Book("Словарь", "Шлепаков А. С.", 2001, 11333);
        Book book3 = new Book("Энциклопедия", "Семенов Р. М.", 2000, 22888);
        Book book4 = new Book("Фантастика", "Головачев В. В.", 2005, 12444);

        petrov.takeBook(book1);
        petrov.showBooks();

        PetrovBooks.add(book2);
        PetrovBooks.add(book4);

        petrov.takeBook(PetrovBooks);
        petrov.showBooks();

        ivanov.takeBook(book4);
        ivanov.showBooks();

        IvanovBooks.add(book1);
        IvanovBooks.add(book3);

        ivanov.takeBook(IvanovBooks);
        ivanov.showBooks();

    }

}