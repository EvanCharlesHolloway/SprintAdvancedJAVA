public class Author {
    private String name;
    private String dateOfBirth;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Author: " + name + ", Date of Birth: " + dateOfBirth;
    }
}
