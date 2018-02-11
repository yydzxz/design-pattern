package com.company.observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        GeneralDisplay generalDisplay=new GeneralDisplay(weatherData,"g1");
        GeneralDisplay generalDisplay2=new GeneralDisplay(weatherData,"g2");
        GeneralDisplay generalDisplay3=new GeneralDisplay(weatherData,"g3");
        GeneralDisplay generalDisplay4=new GeneralDisplay(weatherData,"g4");
        weatherData.setMeasurements(1f,2f,3f);
    }
}
