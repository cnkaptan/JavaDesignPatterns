package com.cnkaptan.DesignPatterns.CommandPattern.tutorial_sprint;

/**
 * Created by cnkaptan on 04/06/16.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
