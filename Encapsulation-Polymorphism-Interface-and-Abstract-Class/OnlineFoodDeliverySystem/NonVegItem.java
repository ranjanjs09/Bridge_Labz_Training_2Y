package OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 5.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + ADDITIONAL_CHARGE) * getQuantity();
    }

    @Override
    public void applyDiscount() {
        // Example: 5% discount on non-veg items
        double discount = calculateTotalPrice() * 0.05;
        setPrice(getPrice() - (discount / getQuantity()));
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Non-Veg Item";
    }
}
