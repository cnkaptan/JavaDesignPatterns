package com.cnkaptan.DesignPatterns.StrategyPattern.PaymentExample;

public class BasicPrice {
    private static BasicPrice basicPrice = new BasicPrice();
    private float price;

    // Prevent more than one copy
    private BasicPrice() {
    }

    // Return only instance
    public static BasicPrice getInstance(){
        return basicPrice;
    }

    protected float getPrice(){
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
