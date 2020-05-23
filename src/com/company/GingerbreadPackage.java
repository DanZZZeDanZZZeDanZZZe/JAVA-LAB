package com.company;

public class GingerbreadPackage implements Order{
    public void add(String product) {
        System.out.println(product + " добавлен в пакет с пряниками");
    };
    public void giveToTheCourier() {
        System.out.println("пряники из заказа переданы курьеру");
    };
}
