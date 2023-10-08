import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        // Додавання книги до бібліотеки
    }

    public void displayBooks() {
        // Відображення всіх книг в бібліотеці
    }

    public Book findBookByTitle(String title) {
        // Пошук книги за назвою
        return null;
    }

    public void removeBookByIsbn(String isbn) {
        // Видалення книги за ISBN
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}