package com.company;

public interface ProductInterface {
    String name = "";
    String productType = "";

    int quantity = 0;
    int price = 0;
    int numberOfServings = 0;

   /* float calculatePortion(int quantity, int numberOfServings);
    float calculatePortionPrice(int price, int numberOfServings);*/

    String getName();
    String getProductType();

    String getQuantity();
    String getPrice();

    int getNumberOfServings();
}

