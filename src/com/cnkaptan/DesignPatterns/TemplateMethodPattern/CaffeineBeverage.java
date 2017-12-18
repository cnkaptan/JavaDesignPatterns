package com.cnkaptan.DesignPatterns.TemplateMethodPattern;

/**
 * Created by cnkaptan on 11/06/16.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pouring in the cup.");
    }
}
