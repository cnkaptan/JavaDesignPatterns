package com.cnkaptan.DesignPatterns.AdapterPattern.AnimalExample;

/**
 * Created by cnkaptan on 04/06/16.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
