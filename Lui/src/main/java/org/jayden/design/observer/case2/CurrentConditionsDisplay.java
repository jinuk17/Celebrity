package org.jayden.design.observer.case2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer{
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
		System.out.println(CurrentConditionsDisplay.class.getName());
		System.out.println("Temperature = " + this.temperature);
		System.out.println("Humidity = " + this.humidity);
	}


	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}		
	}
}
