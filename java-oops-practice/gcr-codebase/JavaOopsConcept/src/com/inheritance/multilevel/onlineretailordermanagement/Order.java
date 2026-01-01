package com.inheritance.multilevel.onlineretailordermanagement;

public class Order {

    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}
