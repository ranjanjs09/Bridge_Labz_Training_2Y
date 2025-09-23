package ECommercePlatform;

public class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.08; // 8% tax

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Example: 20% discount on clothing
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing tax rate: " + (TAX_RATE * 100) + "%";
    }
}
