package org.jayden.design.observer.case1;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
		
		weatherData.setMeasurements(10f, 20f, 30f);
		weatherData.setMeasurements(11f, 21f, 31f);
		weatherData.setMeasurements(12f, 22f, 32f);
		weatherData.setMeasurements(13f, 23f, 33f);
		
	}
}
