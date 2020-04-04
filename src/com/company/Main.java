package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
      /*  List<Drink> appleJuiceWarehouse = new ArrayList();

        AppleJuiceSupply appleJuiceSupply = new AppleJuiceSupply(appleJuiceWarehouse);
        SellingAppleJuice sellingAppleJuice = new SellingAppleJuice(appleJuiceWarehouse);
        appleJuiceSupply.start();
        sellingAppleJuice.start();*/

        List<Drink> drinkList = new ArrayList();
        List<String> stringList = FileScanner.getList("src/files/in.txt");

        for(String string : stringList){
            String[] props = new String[3];
            props = string.split(",", 3);

            String name = props[0].trim();
            int quantity = Integer.parseInt(props[1].trim());
            int price = Integer.parseInt(props[2].trim());

            Drink Juice = new Drink(name, quantity, price);
            drinkList.add(Juice);
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/files/out.txt")))
        {
            for(Drink drink : drinkList) {
                oos.writeObject(drink);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}