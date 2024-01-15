import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}

class Library {
    private List<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }


    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library: " + book.getTitle());
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        System.out.println();
    }
}

public class Mainn {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");

        // Crearea unei instanțe de bibliotecă
        Library library = new Library();

        // Adăugarea cărților în bibliotecă
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Afișarea cărților din bibliotecă
        library.displayBooks();

        // Ștergerea unei cărți din bibliotecă
        library.removeBook(book2);

        // Afișarea cărților actualizate din bibliotecă
        library.displayBooks();
    }
}