package ECommercePlatform;

public class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.15; // 15% tax

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Example: 10% discount on electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics tax rate: " + (TAX_RATE * 100) + "%";
    }
}
