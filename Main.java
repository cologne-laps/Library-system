public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("123456", "Java Programming", "John Doe");
        Book book2 = new Book("789012", "Data Structures", "Jane Doe");

        // Create users
        User user1 = new User("User001", "Alice");
        User user2 = new User("User002", "Bob");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Display available books
        library.displayAvailableBooks();

        // Users borrow books
        library.borrowBook(user1, book1);
        library.borrowBook(user2, book2);

        // Display borrowed books
        library.displayBorrowedBooks();

        // Users return books
        library.returnBook(user1, book1);
        library.returnBook(user2, book2);

        // Display available books after returns
        library.displayAvailableBooks();
    }
}
