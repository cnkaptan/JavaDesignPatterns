package com.cnkaptan.DesignPatterns.CommandPattern.tutorial_sprint;

/**
 * Created by cnkaptan on 04/06/16.
 */
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
