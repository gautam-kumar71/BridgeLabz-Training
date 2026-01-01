package com.inheritance.multilevel.onlineretailordermanagement;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // calling Order constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding method
    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}
