package com.cnkaptan.DesignPatterns.TemplateMethodPattern;

/**
 * Created by cnkaptan on 11/06/16.
 */
public class CaffeineSample {

    public static void main(String[] args){
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println("");
        coffee.prepareRecipe();

    }
}
