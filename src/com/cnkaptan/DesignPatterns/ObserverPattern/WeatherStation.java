package com.cnkaptan.DesignPatterns.ObserverPattern;

/**
 * Created by cnkaptan on 13/12/15.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =new CurrentConditionDisplay(weatherData);

        WeatherSubjectForObservableClass weatherSubjectForObservableClass = new WeatherSubjectForObservableClass();
        CurrentConditionsDisplayForObserver currentConditionsDisplayForObserver = new CurrentConditionsDisplayForObserver(weatherSubjectForObservableClass);


        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);

        weatherSubjectForObservableClass.setMeasurements(80,65,30.4f);
        weatherSubjectForObservableClass.setMeasurements(82,70,29.2f);
    }
}
