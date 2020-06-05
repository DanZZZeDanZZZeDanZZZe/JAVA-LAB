package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        NewOrder order = new NewOrder();
        Seller seller = new Seller();
        order.addItem("Vaska");
        order.addObserver(seller);
        order.addItem("Anna");
        order.removeItem("Vaska");
   /*     String fp1 = "butterCookies";
        String fp2 = "gingerbread";

        FlourProductFactory flourProductFactory = new FlourProductFactory();
        FlourProduct flourProduct1 =
                flourProductFactory.getCurrentFlourProduct(fp1, "печенье",1,1,1);
        FlourProduct flourProduct2 =
                flourProductFactory.getCurrentFlourProduct(fp2, "пряник",1,1,1);

        /*  List<Drink> appleJuiceWarehouse = new ArrayList();

        AppleJuiceSupply appleJuiceSupply = new AppleJuiceSupply(appleJuiceWarehouse);
        SellingAppleJuice sellingAppleJuice = new SellingAppleJuice(appleJuiceWarehouse);
        appleJuiceSupply.start();
        sellingAppleJuice.start();*/

      /*  List<Drink> drinkList = new ArrayList();
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

        HighCostInterface aHigherPrice = (int cost) -> {
            int count = 0;
            for ( Drink drink : drinkList ) {
                if( drink.price > cost ) count++;
            } return count;
        };

        System.out.println("Количество напитков дороже 55: " + aHigherPrice.getAHigherPrice(55));

        AbsFactory factoryCreator = new AbsFactory();
        InteAbsFactory drinkFactory = factoryCreator.getFactory("drink");
        InteAbsFactory fpFactory = factoryCreator.getFactory("flour product");

        drinkFactory.sayHi();
        fpFactory.sayHi();

        // drinkList массив обьектов считанных в прошлой лабораторной
        DynamicArray dynamicArray = new DynamicArray();
        for(Drink drink : drinkList) {
            int index = drinkList.indexOf(drink);
            dynamicArray.push(drink.quantity);
            System.out.println(index + " элемент массива: " + dynamicArray.getItem(index));
        }
        System.out.println("Количество совпадений: " + dynamicArray.findCollisions());
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/files/out.txt")))
        {
            for(Drink drink : drinkList) {
                oos.writeObject(drink);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }*/


    }
    }