package homework.oop.classes_homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В.В.",
                1234,
                "ВМК",
                1988,
                12,
                19,
                "89012345678"
        );


        List<String[]> books = new ArrayList();
        books.add(new String[]{"Effective Java", "Joshua Bloch", "2001"});
        books.add(new String[]{"Java: The Complete Reference", "Herbert Schildt", "2001"});
        books.add(new String[]{"Head First Java", "Kathy Sierra ", "2003"});

        Book book1 = new Book(books.get(0)[0], books.get(0)[1], books.get(0)[2], 1);
        Book book2 = new Book(books.get(1)[0], books.get(1)[1], books.get(1)[2], 2);
        Book book3 = new Book(books.get(2)[0], books.get(2)[1], books.get(2)[2], 3);

        reader.takeBook(book1);
        reader.takeBook(book2);
        reader.takeBook(book3);

        reader.takeBook(3);
        reader.takeBook("Effective Java", "Java: The Complete Reference", "Head First Java");
        reader.takeBook();

        reader.returnBook(book2);
        reader.returnBook(2);
        reader.returnBook();
    }


}
