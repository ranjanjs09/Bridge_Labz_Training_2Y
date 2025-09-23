package LibraryManagementSystem;

public class Book extends LibraryItem {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 21 days loan duration for books
    }
}
