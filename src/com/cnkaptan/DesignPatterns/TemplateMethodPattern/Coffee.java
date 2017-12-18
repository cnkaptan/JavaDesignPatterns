package com.cnkaptan.DesignPatterns.TemplateMethodPattern;

/**
 * Created by cnkaptan on 11/06/16.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
