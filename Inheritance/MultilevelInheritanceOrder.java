/**
 * MultilevelInheritanceOrder.java
 * Demonstrates multilevel inheritance with Order, ShippedOrder, DeliveredOrder classes.
 */

class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class MultilevelInheritanceOrder {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2024-06-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2024-06-02", "TRACK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2024-06-03", "TRACK124", "2024-06-05");

        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
