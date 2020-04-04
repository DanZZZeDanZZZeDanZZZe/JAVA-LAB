package com.company;

import java.util.List;

public class AppleJuiceSupply extends Thread {
    List<Drink> appleJuiceWarehouse;

    AppleJuiceSupply(List<Drink> appleJuiceWarehouse) {
        this.appleJuiceWarehouse = appleJuiceWarehouse;
    }
    public void run() {
        for(int i = 0; i < 10; i++) {
            Drink appleJuice = new Drink("сок яблочный", 300, 60);
            appleJuiceWarehouse.add(appleJuice);
            System.out.println("Поставлена бутылка яблочного сока");
            System.out.println("Число бутылок на складе " + appleJuiceWarehouse.size());
            try{
                sleep(2000);
            } catch (InterruptedException e){}

        }
    }
}
