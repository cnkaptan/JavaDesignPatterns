package com.cnkaptan.DesignPatterns.BridgePattern;

public class Open implements SandwichInterface {
    @Override
    public void makeSandwich(String filling1, String filling2) {
        System.out.println("Open sandwich " + filling1 + filling2);
    }
}
