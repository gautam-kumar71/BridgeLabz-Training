package com.inheritance.multilevel.onlineretailordermanagement;


public class OrderTest {

    public static void main(String[] args) {

        Order o1 = new Order("ORD101", "01-01-2026");
        Order o2 = new ShippedOrder("ORD102", "02-01-2026", "TRK5678");
        Order o3 = new DeliveredOrder("ORD103", "03-01-2026",
                                      "TRK9999", "05-01-2026");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
