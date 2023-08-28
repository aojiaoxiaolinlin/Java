package com.lin.design_patterns.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerObserver(new WeatherDisplayA());
        weatherStation.registerObserver(new WeatherDisplayB());

        weatherStation.setMessage("Sunny");
    }
}
