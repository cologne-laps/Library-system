import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;

    public Library() {
        availableBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void borrowBook(User user, Book book) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            borrowedBooks.add(book);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    public void returnBook(User user, Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            availableBooks.add(book);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book not borrowed by " + user.getName());
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
        System.out.println();
    }
}
