import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Authors
        Author harperLee = new Author("Harper Lee", "April 28, 1926");
        Author georgeOrwell = new Author("George Orwell", "June 25, 1903");
        Author fScottFitzgerald = new Author("F. Scott Fitzgerald", "September 24, 1896");
        Author hermanMelville = new Author("Herman Melville", "August 1, 1819");
        Author janeAusten = new Author("Jane Austen", "December 16, 1775");
        Author jkRowling = new Author("J.K. Rowling", "July 31, 1965");
        // Add more authors as needed

        // Books
        List<Book> books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", harperLee, 3));
        books.add(new Book("1984", georgeOrwell, 5));
        books.add(new Book("The Great Gatsby", fScottFitzgerald, 2));
        books.add(new Book("Moby-Dick", hermanMelville, 4));
        books.add(new Book("Pride and Prejudice", janeAusten, 6));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", jkRowling, 8));
        // Add more books as needed

        // Patrons
        Patron patron1 = new Patron("John Doe", "123 Main St", "555-1234");
        Patron patron2 = new Patron("Alice Johnson", "456 Elm St", "555-5678");
        Patron patron3 = new Patron("Michael Smith", "789 Oak St", "555-7890");
        Patron patron4 = new Patron("Emily White", "101 Pine St", "555-1010");
        Patron patron5 = new Patron("David Brown", "202 Cedar St", "555-2020");
        
        // Add more patrons as needed

        Library library = new Library(books);

        // Interaction examples
        Book searchedBook = library.searchBookByTitle("Harry Potter and the Sorcerer's Stone");
        if (searchedBook != null) {
            System.out.println("Found book: " + searchedBook.getTitle() +
                    " by " + searchedBook.getAuthor().getName());

            patron3.borrowBook(searchedBook, 3);
            patron4.borrowBook(searchedBook, 2);
            patron5.borrowBook(searchedBook, 1);

            // Simulate returns
            patron3.returnBook(searchedBook, 2);
            patron4.returnBook(searchedBook, 1);

            System.out.println("Available copies of " + searchedBook.getTitle() + ": " + searchedBook.getAvailableCopies());
        } else {
            System.out.println("Book not found.");
        }
        
        Book anotherBook = library.searchBookByTitle("1984");
        if (anotherBook != null) {
            System.out.println("Found book: " + anotherBook.getTitle() +
                    " by " + anotherBook.getAuthor().getName());

            patron1.borrowBook(anotherBook, 4);
            patron2.borrowBook(anotherBook, 2);

            // Simulate returns
            patron1.returnBook(anotherBook, 3);
            patron2.returnBook(anotherBook, 1);

            System.out.println("Available copies of " + anotherBook.getTitle() + ": " + anotherBook.getAvailableCopies());
        } else {
            System.out.println("Book not found.");
        }
    }
}
