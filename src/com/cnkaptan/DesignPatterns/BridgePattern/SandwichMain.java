package com.cnkaptan.DesignPatterns.BridgePattern;

public class SandwichMain {
    public static void main(String[] args) {
        AbstractSandwich openSandwich = new Sandwich("Cheese ", "Tomato", new
                Open());
        openSandwich.make();
        AbstractSandwich closedSandwich = new Sandwich("Ham ", "Eggs", new
                Closed());
        closedSandwich.make();
    }
}
