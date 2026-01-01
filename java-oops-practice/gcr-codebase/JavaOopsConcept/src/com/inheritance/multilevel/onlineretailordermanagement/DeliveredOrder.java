package com.inheritance.multilevel.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding method
    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}
