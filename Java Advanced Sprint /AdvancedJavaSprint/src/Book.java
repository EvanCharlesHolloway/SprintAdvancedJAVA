public class Book {
    private String title;
    private Author author;
    private int totalCopies;
    private int availableCopies;

    public Book(String title, Author author, int totalCopies) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public boolean borrowBook(int numCopies) {
        if (availableCopies >= numCopies) {
            availableCopies -= numCopies;
            return true;
        }
        return false;
    }

    public void returnBook(int numCopies) {
        availableCopies += numCopies;
        if (availableCopies > totalCopies) {
            availableCopies = totalCopies;
        }
    }
}
