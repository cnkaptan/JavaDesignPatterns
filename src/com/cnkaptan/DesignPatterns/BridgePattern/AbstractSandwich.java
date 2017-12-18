package com.cnkaptan.DesignPatterns.BridgePattern;

public abstract class AbstractSandwich {
    protected SandwichInterface sandwichInterface;

    protected AbstractSandwich(SandwichInterface sandwichInterface) {
        this.sandwichInterface = sandwichInterface;
    }

    public abstract void make();
}
