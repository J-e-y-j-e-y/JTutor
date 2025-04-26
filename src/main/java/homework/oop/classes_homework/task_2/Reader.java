package homework.oop.classes_homework.task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reader {
    static List<Book> returnedBook = new ArrayList<>();

    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private List<Book> takenBooks = new ArrayList<>(); //  можно заранее проинициализировать дефолтным значением?

    // что делать с длиной сигнатуры метода?
    public Reader(String fullName, int libraryCardNumber, String faculty, int year, int month, int day, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = LocalDate.of(year, month, day); // можон ли подобные вещи сгенерировать автоматически с помощью IDE?
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(Book book) {
        takenBooks.add(book);
    }

    public void takeBook(int bookAmount) {
        System.out.println(fullName + " взял " + bookAmount + " книги");
    }

    public void takeBook(String... bookTitles) {
        String titles = Arrays.toString(bookTitles);
        System.out.println(fullName + " взял книги: " + titles.substring(1, titles.length()-1));
    }

    public void takeBook() {
        String titles = "";
        for (Book book: takenBooks) {
            if (!book.equals(takenBooks.get(takenBooks.size()-1))) {
                titles += book.getBookTitle() + ", ";
            }
            else {
                titles += book.getBookTitle();
            }

        }
        System.out.println(fullName + " взял книги: " + titles);
    }

    public void returnBook(Book book) {
        Reader.returnedBook.add(book);
        takenBooks.remove(book);
    }

    public void returnBook(int bookAmount) {
        System.out.println(fullName + " вернул " + bookAmount + " книги");
    }

    public void returnBook() {
        String titles = "";
        for (Book book : returnedBook) {
            if (book.equals(returnedBook.size()-1)) {
                titles += book.getBookTitle() + ", ";
            }
            titles += book.getBookTitle();
        }
        System.out.println(fullName + " вернул книги: " + titles);
    }

}
