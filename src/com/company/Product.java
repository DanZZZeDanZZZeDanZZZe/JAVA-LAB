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

    public void setName(String name) {
        try {
            if (name.length() > ProductInterface.maxNameLength) {
                throw new Error("Длинна названия не должна быть больше 30 символов!");
            }
            this.name = name;
        } catch (Error e) {
            System.out.println(e.getMessage());
            System.out.println("Присвоена пустая строка");
            this.name = "";
        }
    }

    public void setNumberOfServings(int name) {
        try {
            if (numberOfServings > ProductInterface.maxNumberOfServings) {
                throw new Error("Кусков не может быть больше 45-ти!");
            }
            this.numberOfServings = numberOfServings;
        } catch (Error e) {
            System.out.println(e.getMessage());
            System.out.println("Присвоена еденица");
            this.numberOfServings = 1;
        }
    }

    public String getName() {
        return name;
    };
    public String getProductType() {
        return productType;
    };

    public int getNumberOfServings() {
        return  numberOfServings;
    }
    public String getPrice() {
        return String.valueOf(price) + " руб.";
    }
}
