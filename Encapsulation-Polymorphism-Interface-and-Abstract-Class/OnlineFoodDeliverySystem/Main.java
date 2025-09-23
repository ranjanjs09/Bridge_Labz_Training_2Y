package OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegItem = new VegItem("Paneer Tikka", 150, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Curry", 200, 1);

        order.add(vegItem);
        order.add(nonVegItem);

        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount();
                System.out.println(discountableItem.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("-------------------------");
        }
    }
}
