package com.company.observer;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer ,Display{
    Observable observable;
    private float temperature;
    private float humidity;
    private String name;

    public GeneralDisplay(Observable observable,String name){
        this.observable=observable;
        this.name=name;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherData=(WeatherData)observable;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("GeneralDisplay:"+this.name);
        System.out.println("温度："+this.temperature);
        System.out.println("湿度："+this.humidity);
    }

}
