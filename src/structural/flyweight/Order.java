package structural.flyweight;

public class Order {

    private String orderNumber;

    private Item item;

    public Order(String orderNumber, Item item) {
        this.item = item;
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", item={" + item +
                "}}";
    }
}
