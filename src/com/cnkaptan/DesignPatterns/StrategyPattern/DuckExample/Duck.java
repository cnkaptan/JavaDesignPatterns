package com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample;

import com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.flyBehaviours.FlyBehaviour;
import com.cnkaptan.DesignPatterns.StrategyPattern.DuckExample.quackBehaviors.QuackBehavior;

/**
 * Created by cnkaptan on 06/12/15.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
