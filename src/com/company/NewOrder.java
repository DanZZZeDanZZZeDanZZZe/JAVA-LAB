package com.company;

import java.util.ArrayList;
import java.util.List;

public class NewOrder {
    private List<Observer> observers = new ArrayList<Observer>();
    private List<String> orderItems = new ArrayList<String>();
    public void addItem(String name) {
        orderItems.add(name);
        notifyObservers();
    }
    public void removeItem(String name) {
        orderItems.remove(name);
        notifyObservers();
    }
    public void addObserver(Observer observer){
        orderItems.add(observer);
    }
    public void removeObserver(Observer observer) {
        orderItems.remove(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.event(orderItems);
        }
    }
}
