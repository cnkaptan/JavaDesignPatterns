package com.cnkaptan.DesignPatterns.AdapterPattern.AnimalExample;

/**
 * Created by cnkaptan on 04/06/16.
 */
public class DuckTestDrive {
    public static void main(String[] args){

        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
