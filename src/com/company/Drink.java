package com.company;

public class Drink extends Product {
    Drink(String name, int quantity, int price) {
        productType = "напиток";
        this.numberOfServings = 1;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getQuantity() {
        String quantity = super.getQuantity();
        return quantity + " мл.";
    }
}
