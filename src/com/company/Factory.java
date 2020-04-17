package com.company;

public class Factory {
    public FlourProduct getCurrentFlourProduct(
            String inputos,
            String name,
            int quantity,
            int price,
            int numberOfServings
    ) {
        FlourProduct flourProduct = null;
        if (inputos.equals("butterCookies")) {
            flourProduct = new ButterCookies(name, quantity, price, numberOfServings);
        }
        if (inputos.equals("gingerbread")) {
            flourProduct = new Gingerbread(name, quantity, price, numberOfServings);
        }
        return flourProduct;
    }
}
