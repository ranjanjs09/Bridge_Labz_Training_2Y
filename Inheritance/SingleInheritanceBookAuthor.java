/**
 * SingleInheritanceBookAuthor.java
 * Demonstrates single inheritance with Book superclass and Author subclass.
 */

class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class SingleInheritanceBookAuthor {
    public static void main(String[] args) {
        Author author = new Author("Inheritance in Java", 2023, "John Doe", "Java enthusiast and author.");
        author.displayInfo();
    }
}
