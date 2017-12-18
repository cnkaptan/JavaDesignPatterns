package com.cnkaptan.DesignPatterns.FacadePattern;

public class Drink implements Product {
    @Override
    public int dispense() {
        return 200;
    }
}
