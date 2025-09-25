// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "OOP Concepts", "Grady Booch");
        library.addBook(b1);
        library.addBook(b2);

        User u1 = new User(101, "Alice");
        library.addUser(u1);

        library.displayBooks();
        library.issueBook(1, 101);
        library.displayBooks();
        library.returnBook(1, 101);
        library.displayBooks();
    }
}
