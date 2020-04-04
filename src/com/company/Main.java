package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> appleJuiceWarehouse = new ArrayList();

        AppleJuiceSupply appleJuiceSupply = new AppleJuiceSupply(appleJuiceWarehouse);
        SellingAppleJuice sellingAppleJuice = new SellingAppleJuice(appleJuiceWarehouse);
        appleJuiceSupply.start();
        sellingAppleJuice.start();
    }
}