import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

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
