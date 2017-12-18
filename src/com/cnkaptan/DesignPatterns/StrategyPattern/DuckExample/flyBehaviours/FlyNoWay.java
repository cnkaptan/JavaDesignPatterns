package com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.flyBehaviours;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("it cant Fly");
    }
}
