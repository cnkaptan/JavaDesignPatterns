package com.cnkaptan.DesignPatterns.TemplateMethodPattern;

/**
 * Created by cnkaptan on 11/06/16.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping to tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
