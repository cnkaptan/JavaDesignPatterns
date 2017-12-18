package com.cnkaptan.DesignPatterns.SingletonPattern;

/**
 * Created by cnkaptan on 03/06/16.
 */

/**
   Using this approach, We rely on the JVM to create the unique instance of the Singleton
   when the class loaded. The JVM guarantees that the instance will be created before any thread
   beforeany thread accesses the static uniqe instance variable
 */
public class Singleton2 {
    // This code guarantee thread safe
    public static Singleton2 singleton = new Singleton2();

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        return singleton;
    }
}
