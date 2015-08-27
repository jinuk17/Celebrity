package org.jayden.design.decorator.case1.beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 1d;
	}
}
