package com.company;

public class OrderFacade {
    private GingerbreadPackage gingerbreadPackage;
    private CoffePackage coffePackage;
    public OrderFacade() {
        gingerbreadPackage = new GingerbreadPackage();
        coffePackage = new CoffePackage();
    }
    public void addOrder(String gingerbread, String coffe) {
        gingerbreadPackage.add(gingerbread);
        coffePackage.add(coffe);
    }
    public void giveOrderToTheCourier() {
        gingerbreadPackage.giveToTheCourier();
        coffePackage.giveToTheCourier();
    }
}
