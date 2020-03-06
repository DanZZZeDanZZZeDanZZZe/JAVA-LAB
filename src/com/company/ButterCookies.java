package com.company;

public class ButterCookies extends FlourProduct{
    //печенье песочное выемное, песочно-отсадное, белково-сбивное, сухарики, миндально-ореховое
    ButterCookies(String name, int quantity, int price, int numberOfServings) {
        super(name, quantity, price, numberOfServings);
        productType = "печенье сдобное";
        //сырцовые и заварные
    }
}
