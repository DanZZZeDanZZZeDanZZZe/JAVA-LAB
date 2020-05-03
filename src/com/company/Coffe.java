package com.company;

public class Coffe extends Drink {
    Coffe (String name, int quantity, int price) {
        super(name, quantity, price);
        productType = "кофе";
        System.out.println("кофе приготовлен");
    }
}
