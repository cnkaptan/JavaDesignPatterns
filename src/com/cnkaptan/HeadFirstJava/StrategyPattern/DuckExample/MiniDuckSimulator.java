package com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample;

import com.cnkaptan.HeadFirstJava.StrategyPattern.DuckExample.flyBehaviours.FlyRocketPowered;

/**
 * Created by cnkaptan on 06/12/15.
 */
public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck duck = new MallardDuck();

        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
