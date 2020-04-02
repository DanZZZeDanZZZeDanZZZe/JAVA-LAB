package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //sellingAppleJuice
    public static void main(String[] args) {
        List<Drink> appleJuiceWarehouse = new ArrayList<Drink>();

        class AppleJuiceSupply extends Thread {
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

        AppleJuiceSupply appleJuiceSupply = new AppleJuiceSupply(appleJuiceWarehouse);
        SellingAppleJuice sellingAppleJuice = new SellingAppleJuice(appleJuiceWarehouse);
        appleJuiceSupply.start();
        sellingAppleJuice.start();
    }
}