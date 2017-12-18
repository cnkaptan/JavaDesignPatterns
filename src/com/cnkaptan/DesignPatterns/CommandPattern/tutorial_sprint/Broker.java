package com.cnkaptan.DesignPatterns.CommandPattern.tutorial_sprint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cnkaptan on 04/06/16.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
