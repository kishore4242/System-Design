public enum OrderStatus {
    PLACED("Order Placed"),
    SHIPPED("Order Shipped"),
    DELIVERED("Order Delivered");

    private final String message;
    OrderStatus(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
