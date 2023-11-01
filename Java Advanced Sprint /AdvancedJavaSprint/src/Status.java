/**
 * The Status enum represents the different states a book can be in:
 * - AVAILABLE: Indicates that the book is available for borrowing.
 * - CHECKED_OUT: Indicates that the book has been checked out by a patron.
 * - OVERDUE: Indicates that the book is overdue, meaning it has not been returned within the due date.
 */
public enum Status {
    AVAILABLE, // The book is available for borrowing.
    CHECKED_OUT, // The book has been checked out by a patron.
    OVERDUE // The book is overdue and has not been returned within the due date.
}
