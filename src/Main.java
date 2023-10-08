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

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Назва: " + title + "\nАвтор: " + author + "\nISBN: " + isbn + "\nРік видання: " + year + "\n";
    }

}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга додана до бібліотеки.");
    }

    public void displayBooks() {
        System.out.println("Книги в бібліотеці:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void removeBookByIsbn(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Книга з ISBN " + isbn + " видалена з бібліотеки.");
        } else {
            System.out.println("Книгу з ISBN " + isbn + " не знайдено в бібліотеці.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Додавання книг
        library.addBook(new Book("Книга 1", "Автор 1", "1234567890", 2022));
        library.addBook(new Book("Книга 2", "Автор 2", "0987654321", 2023));

        // Показати всі книги що в бібліотеці
        library.displayBooks();

        // Шукати книгу за назвою
        Book foundBook = library.findBookByTitle("Книга 1");
        if (foundBook != null) {
            System.out.println("Знайдена книга:\n" + foundBook);
        } else {
            System.out.println("Книга не знайдена.");
        }

        // Видалити книгу за ISBN
        library.removeBookByIsbn("1234567890");

        // Повторний показ всіх книг
        library.displayBooks();
    }
}