import java.util.List;

/**
 * The Library class represents a collection of books and provides search functionality.
 */
public class Library {

    private List<Book> books; // List of books in the library.

    /**
     * Constructs a Library object with the given list of books.
     *
     * @param books The list of books to be managed by the library.
     */
    public Library(List<Book> books) {
        this.books = books;
    }

    /**
     * Searches for a book in the library by its title.
     *
     * @param title The title of the book to search for.
     * @return The Book object if found, null otherwise.
     */
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
