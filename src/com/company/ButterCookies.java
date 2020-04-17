package com.company;

public class ButterCookies extends FlourProduct{
    ButterCookies(String name, int quantity, int price, int numberOfServings) {
        super(name, quantity, price, numberOfServings);
        productType = "печенье сдобное";
        System.out.println("Печенье сдобное созданно");
    }
}
