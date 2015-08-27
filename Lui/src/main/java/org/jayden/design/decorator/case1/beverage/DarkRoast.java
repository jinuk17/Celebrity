package org.jayden.design.decorator.case1.beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		this.description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return .99d;
	}

}
