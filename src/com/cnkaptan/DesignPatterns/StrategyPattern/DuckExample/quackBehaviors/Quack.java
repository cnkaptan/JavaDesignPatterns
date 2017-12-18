package com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.quackBehaviors;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("just Quck");
    }
}
