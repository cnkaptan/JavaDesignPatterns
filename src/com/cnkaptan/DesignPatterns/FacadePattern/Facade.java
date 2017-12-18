package com.cnkaptan.DesignPatterns.FacadePattern;

public class Facade {
    private Product crisps;
    private Product fruit;
    private Product drink;

    public Facade() {
        crisps = new Crisps();
        fruit = new Fruit();
        drink = new Drink();
    }

    public int dispenseCrisps(){
        return crisps.dispense();
    }

    public int dispenseFruit(){
        return fruit.dispense();
    }

    public int dispenseDrink(){
        return drink.dispense();
    }
}
