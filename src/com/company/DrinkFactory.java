package com.company;

public class DrinkFactory implements InteAbsFactory{
    public Drink getCurrentDrink(
            String inputos,
            String name,
            int quantity,
            int price
    ) {
        Drink drink = null;
        if (inputos.equals("coffe")) {
            drink = new Coffe(name, quantity, price);
        }
        if (inputos.equals("apple juce")) {
            drink = new AppleJuce(name, quantity, price);
        }
        return drink;
    }

    public void sayHi() {
        System.out.println("Фабрика напитков!");
    }
}
