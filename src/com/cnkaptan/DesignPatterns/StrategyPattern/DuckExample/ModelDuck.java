package com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample;

import com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.flyBehaviours.FlyNoWay;
import com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.quackBehaviors.MuteQuack;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm a Model Duck!");
    }
}
