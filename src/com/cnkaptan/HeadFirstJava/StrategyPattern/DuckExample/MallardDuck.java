package com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample;

import com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample.flyBehaviours.FlyWithWings;
import com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample.quackBehaviors.Quack;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehavior = new Quack();
    }



    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
