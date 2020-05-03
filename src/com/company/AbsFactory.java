package com.company;

public class AbsFactory {
    public InteAbsFactory getFactory(
            String inputs
    ) {
        InteAbsFactory iFactory = null;

        if (inputs.equals("drink")) {
            iFactory = new DrinkFactory();
        }
        if (inputs.equals("flour product")) {
            iFactory = new FlourProductFactory();
        }
        return iFactory;
    }
}
