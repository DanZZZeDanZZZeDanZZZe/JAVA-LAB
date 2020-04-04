package com.company;

import java.util.List;


class SellingAppleJuice extends Thread {
    List<Drink> appleJuiceWarehouse;



    SellingAppleJuice(List<Drink> appleJuiceWarehouse) {
        this.appleJuiceWarehouse = appleJuiceWarehouse;
    }
    public void run() {
        for(int i = 0; i < 10; i++) {
            try{
                sleep(4000);
            } catch (InterruptedException e){}

            appleJuiceWarehouse.remove(appleJuiceWarehouse.size()-1);
            System.out.println("Продана бутылка яблочного сока");
            System.out.println("Число бутылок на складе " + appleJuiceWarehouse.size());


        }
    }
}

