package com.company;

public class Gingerbread extends FlourProduct {
    Gingerbread(String name, int quantity, int price, int numberOfServings) {
        super(name, quantity, price, numberOfServings);
        productType = "пряник";
        //сырцовые и заварные
    }
}
