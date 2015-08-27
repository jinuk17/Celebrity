package org.jayden.design.decorator.case1.condiment;

import org.jayden.design.decorator.case1.beverage.Beverage;

public class Mocha extends CondimentDecorator {

	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " / add Mocha";
	}

	@Override
	public double cost() {
		return .2d + this.beverage.cost();
	}

}
