package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book book = new Book(1, "Java Programming", "Author A");
        Magazine magazine = new Magazine(2, "Tech Monthly", "Author B");
        DVD dvd = new DVD(3, "Learning Java", "Author C");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("-------------------------");
        }
    }
}
