/**
 * The Borrowable interface defines methods for borrowing and returning book copies.
 */
public interface Borrowable {

    /**
     * Borrow a specified number of book copies.
     *
     * @param numCopies The number of copies to borrow.
     */
    void borrowBook(int numCopies);

    /**
     * Return a specified number of borrowed book copies.
     *
     * @param numCopies The number of copies to return.
     */
    void returnBook(int numCopies);
}
