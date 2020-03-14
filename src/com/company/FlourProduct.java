package com.company;

public class FlourProduct extends Product {
    FlourProduct(String name, int quantity, int price, int numberOfServings) {
        productType = "мучное изделие";
        this.numberOfServings = numberOfServings;
        setName(name);
        this.quantity = quantity;
        this.price = price;
    }

    public String getQuantity() {
        String.valueOf(quantity);
        return quantity + " г.";
    }

   /* public String getQuantity() {
        String quantity = super.getQuantity();
        return quantity + " г.";
    }*/
}
