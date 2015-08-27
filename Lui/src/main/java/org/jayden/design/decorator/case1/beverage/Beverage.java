package org.jayden.design.decorator.case1.beverage;

public abstract class Beverage {
	
	protected String description = "제목없음";
	
	public abstract double cost() ;
	public String getDescription() {
		return this.description;
	}

}
