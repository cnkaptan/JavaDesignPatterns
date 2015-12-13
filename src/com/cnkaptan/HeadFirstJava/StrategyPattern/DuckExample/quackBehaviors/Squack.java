package com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample.quackBehaviors;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Robber Duck Quack");
    }
}
