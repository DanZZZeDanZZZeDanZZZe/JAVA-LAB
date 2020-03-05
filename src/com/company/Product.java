package com.company;

public abstract class Product implements ProductInterface {
    protected String name = "";
    protected String productType = "продукт";

    protected int quantity = 0;
    protected int price = 0;
    protected int numberOfServings = 0;


   /* float calculatePortionQuantity(int quantity, int numberOfServings) {

    };
    float calculatePortionPrice(int price, int numberOfServings) {

    };*/

    public String getName() {
        return name;
    };
    public String getProductType() {
        return productType;
    };

    public int getNumberOfServings() {
        return  numberOfServings;
    };
    public String getQuantity() {
        return String.valueOf(quantity);
    }
    public String getPrice() {
        return String.valueOf(price) + " руб.";
    }

   /* public void printProductInformation() {
        System.out.println("Информация о товаре " + name + ": "
            +String.valueOf(quantity) + " "
            +String.valueOf(price) + " "
            +String.valueOf(numberOfServings) + " "
        );
    };*/
}
