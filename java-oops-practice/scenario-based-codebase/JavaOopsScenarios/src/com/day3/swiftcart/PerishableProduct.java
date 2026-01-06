package com.day3.swiftcart;

class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    // 10% discount
    public double getDiscount(double total) {
        return total * 0.10; 
    }
}