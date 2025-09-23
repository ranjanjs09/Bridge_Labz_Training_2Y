package OnlineFoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount() {
        // Example: 10% discount on veg items
        double discount = calculateTotalPrice() * 0.10;
        setPrice(getPrice() - (discount / getQuantity()));
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Item";
    }
}
