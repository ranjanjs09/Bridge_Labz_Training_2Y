package ECommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics electronics = new Electronics(1, "Laptop", 1000);
        Clothing clothing = new Clothing(2, "T-Shirt", 50);
        Groceries groceries = new Groceries(3, "Apple", 2);

        products.add(electronics);
        products.add(clothing);
        products.add(groceries);

        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            String taxDetails = "No tax applicable";

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                tax = taxableProduct.calculateTax();
                taxDetails = taxableProduct.getTaxDetails();
            }

            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println(taxDetails);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-------------------------");
        }
    }
}
