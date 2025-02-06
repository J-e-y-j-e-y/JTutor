package homework.oop.classes_homework.task_2;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookYear;
    private int bookCode;

    public Book(String bookTitle, String bookAuthor, String bookYear, int bookCode) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookCode = bookCode;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}