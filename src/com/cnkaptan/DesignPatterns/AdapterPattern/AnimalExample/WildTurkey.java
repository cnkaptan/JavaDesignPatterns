package com.cnkaptan.DesignPatterns.AdapterPattern.AnimalExample;

/**
 * Created by cnkaptan on 04/06/16.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gooble gooble!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
