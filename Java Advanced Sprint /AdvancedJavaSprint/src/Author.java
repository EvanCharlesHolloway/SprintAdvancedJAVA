/**
 * The Author class represents an author with a name and date of birth.
 */
public class Author {
    private String name; // The name of the author
    private String dateOfBirth; // The date of birth of the author

    /**
     * Constructs an Author object with the given name and date of birth.
     *
     * @param name       The name of the author.
     * @param dateOfBirth The date of birth of the author.
     */
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the date of birth of the author.
     *
     * @return The date of birth of the author.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Overrides the toString method to provide a string representation of the Author object.
     *
     * @return A string representation of the Author object.
     */
    @Override
    public String toString() {
        return "Author: " + name + ", Date of Birth: " + dateOfBirth;
    }
}
