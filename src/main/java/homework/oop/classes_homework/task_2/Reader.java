package main.java.homework.oop.classes_homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String fio;
    private int readersTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private List<Book> takenBooks;

    public Reader(String fio, int readersTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.readersTicketNumber = readersTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        // инициализация массива взятых читатлем книг
        takenBooks = new ArrayList<>();
    }

    public void takeBook(Book book) {
        takenBooks.add(book);
        System.out.println(fio + " взял книгу: " + book.getBookName());
    }

    public void takeBook(List<Book> takenBooks) {
        int index = 0;
        System.out.print(fio + " взял книги: ");

        for (Book book : takenBooks) {
            this.takenBooks.add(book);
            System.out.print(book.getBookName());
            index = takenBooks.indexOf(book);
            // добавляй запятую ко всем названиям книг, кромке последней
            if (!(index == takenBooks.size() - 1)) System.out.print(", ");
        }

        System.out.println();
    }

    public void returnBook(Book book) {
        takenBooks.remove(book);
        System.out.println(fio + " Вернул книгу: " + book.getBookName());
    }

    public void returnBook(List<Book> takenBooks) {
        int index = 0;
        System.out.print(fio + " вернул книги: ");

        for (Book book : takenBooks) {
            this.takenBooks.add(book);
            System.out.print(book.getBookName());
            index = takenBooks.indexOf(book);
            // добавляй запятую ко всем названиям книг, кромке последней
            if (!(index == takenBooks.size() - 1)) System.out.print(", ");
        }

        System.out.println();
    }

    public  void showBooks() {
        int index = 0;
        System.out.print(fio + " имеет на руках след. книги: ");

        for (Book book : takenBooks) {
            System.out.print(book.getBookName());
            index = takenBooks.indexOf(book);
            // добавляй запятую ко всем названиям книг, кромке последней
            if (!(index == takenBooks.size() - 1)) System.out.print(", ");
        }

        System.out.printf("\n-------------------------------------------");
        System.out.println();
    }

}