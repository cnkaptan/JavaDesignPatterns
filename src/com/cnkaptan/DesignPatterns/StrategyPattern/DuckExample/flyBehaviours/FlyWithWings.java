package com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.flyBehaviours;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
