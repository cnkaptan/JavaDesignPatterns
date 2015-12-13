package com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample.flyBehaviours;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying wit a Rocket!");
    }
}
