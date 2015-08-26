package org.jayden.design.observer.case3;

import java.util.Enumeration;
import java.util.Vector;

public class SensorSystem {

	private String alarmSource;
	private int level = 0;
	private Vector<AlarmListener> listeners = new Vector<AlarmListener>();
	
	public void register(AlarmListener al) {
		this.listeners.add(al);
	}
	
	public void giveAlarm(String alarmSource, int level) {
		this.alarmSource = alarmSource;
		this.level = level;
		
		this.notifyObservers();
	}
	
	public void notifyObservers() {
		for(Enumeration<AlarmListener> e = this.listeners.elements(); e.hasMoreElements();) {
			e.nextElement().alarm(this);
		}
	}
	
	public String getAlarmSource() {
		return this.alarmSource;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public static void main(String[] args) {
		
		SensorSystem ss = new SensorSystem();
		
		ss.register(new Lighting());
		ss.register(new Buzzer());
		
		ss.giveAlarm("대문", 9);
	}
	
}
