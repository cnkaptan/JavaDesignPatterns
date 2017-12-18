package com.cnkaptan.DesignPatterns.StrategyPattern.PaymentExample;

public class Payment {
    private Strategy strategy;

    public Payment(Strategy strategy) {
        this.strategy = strategy;
    }

    public String employStrategy(float f) {
        return strategy.processPayment(f);
    }
}
