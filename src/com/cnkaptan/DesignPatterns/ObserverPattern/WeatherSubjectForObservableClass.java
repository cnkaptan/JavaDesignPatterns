package com.cnkaptan.DesignPatterns.ObserverPattern;

import java.util.*;

/**
 * Created by cnkaptan on 13/12/15.
 */
public class WeatherSubjectForObservableClass extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherSubjectForObservableClass(){

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temeperature,float humidity,float pressure){
        this.temperature = temeperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
