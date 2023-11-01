import java.util.ArrayList;
import java.util.List;

/**
 * The Patron class represents a library patron with a name, address, phone number,
 * and a list of borrowed books.
 */
public class Patron {

    private String name; // Name of the patron.
    private String address; // Address of the patron.
    private String phoneNumber; // Phone number of the patron.
    private List<Book> borrowedBooks; // List of books borrowed by the patron.

    /**
     * Constructs a Patron object with the specified name, address, and phone number.
     *
     * @param name        The name of the patron.
     * @param address     The address of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Gets the name of the patron.
     *
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address of the patron.
     *
     * @return The address of the patron.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number of the patron.
     *
     * @return The phone number of the patron.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the list of books borrowed by the patron.
     *
     * @return The list of borrowed books.
     */
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * Allows the patron to borrow a specific number of copies of a book.
     *
     * @param book      The book to be borrowed.
     * @param numCopies The number of copies to borrow.
     */
    public void borrowBook(Book book, int numCopies) {
        if (book.borrowBook(numCopies)) {
            for (int i = 0; i < numCopies; i++) {
                borrowedBooks.add(book);
            }
            System.out.println(name + " borrowed " + numCopies + " copies of " + book.getTitle());
        } else {
            System.out.println(name + " couldn't borrow " + numCopies + " copies of " + book.getTitle());
        }
    }

    /**
     * Allows the patron to return a specific number of copies of a borrowed book.
     *
     * @param book      The book to be returned.
     * @param numCopies The number of copies to return.
     */
    public void returnBook(Book book, int numCopies) {
        int count = 0;
        for (Book borrowedBook : borrowedBooks) {
            if (borrowedBook.getTitle().equals(book.getTitle()) && count < numCopies) {
                borrowedBook.returnBook(1);
                count++;
            }
        }
        System.out.println(name + " returned " + numCopies + " copies of " + book.getTitle());
    }
}
