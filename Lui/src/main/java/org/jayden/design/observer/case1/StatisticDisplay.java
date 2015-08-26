package org.jayden.design.observer.case1;

public class StatisticDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public StatisticDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	public void display() {
		System.out.println(StatisticDisplay.class.getName());
		System.out.println("Temperature = " + this.temperature);
		System.out.println("Humidity = " + this.humidity);
	}

	public void update(float temperature, float humidity, float weatherData) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
