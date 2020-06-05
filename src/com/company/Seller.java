package com.company;

import java.util.List;

public class Seller implements Observer {
    public void event(List<String> strings) {
        System.out.println("The order has changed: " + strings);
    }
}
