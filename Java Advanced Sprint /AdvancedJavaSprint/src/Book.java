/**
 * The Book class represents a book with a title, author, total copies, and available copies.
 */
public class Book {
    private String title; // The title of the book
    private Author author; // The author of the book
    private int totalCopies; // The total number of copies of the book
    private int availableCopies; // The number of available copies of the book

    /**
     * Constructs a Book object with the given title, author, and total copies.
     *
     * @param title       The title of the book.
     * @param author      The author of the book.
     * @param totalCopies The total number of copies of the book.
     */
    public Book(String title, Author author, int totalCopies) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }
    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }
    /**
     * Gets the total number of copies of the book.
     *
     * @return The total number of copies of the book.
     */
    public int getTotalCopies() {
        return totalCopies;
    }
    /**
     * Gets the number of available copies of the book.
     *
     * @return The number of available copies of the book.
     */
    public int getAvailableCopies() {
        return availableCopies;
    }
    /**
     * Borrows a specified number of copies of the book if available.
     *
     * @param numCopies The number of copies to borrow.
     * @return True if the book was successfully borrowed, false otherwise.
     */
    public boolean borrowBook(int numCopies) {
        if (availableCopies >= numCopies) {
            availableCopies -= numCopies;
            return true;
        }
        return false;
    }
    /**
     * Returns a specified number of copies of the book, increasing the available copies.
     *
     * @param numCopies The number of copies to return.
     */
    public void returnBook(int numCopies) {
        availableCopies += numCopies;
        if (availableCopies > totalCopies) {
            availableCopies = totalCopies;
        }
    }
}
