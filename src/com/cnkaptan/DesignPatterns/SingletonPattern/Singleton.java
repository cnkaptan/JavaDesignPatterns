package com.cnkaptan.DesignPatterns.SingletonPattern;

/**
 * Created by cnkaptan on 03/06/16.
 */
public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }


}
