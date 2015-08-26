package org.jayden.design.observer.case1;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if(i >= 0) {
			this.observers.remove(i);
		}
	}

	public void notifyObservers() {
		for(Observer o : this.observers) {
			o.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

}
