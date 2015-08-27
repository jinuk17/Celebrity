package org.jayden.design.decorator.case1.condiment;

import org.jayden.design.decorator.case1.beverage.Beverage;

public class Milk extends CondimentDecorator {

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " / add Mild";
	}

	@Override
	public double cost() {
		return .2d + this.beverage.cost();
	}

}
