package com.cnkaptan.DesignPatterns.BridgePattern;

public class Closed implements SandwichInterface {
    @Override
    public void makeSandwich(String filling1, String filling2) {
        System.out.println("Closed sandwich " + filling1 + filling2);
    }
}
