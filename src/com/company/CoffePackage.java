package com.company;

public class CoffePackage implements Order {
    public void add(String product) {
        System.out.println(product + " добавлен в пакет с напитками");
    };
    public void giveToTheCourier() {
        System.out.println("кофе из заказа передан курьеру");
    };
}
