package org.jayden.design.decorator.case1.condiment;

import org.jayden.design.decorator.case1.beverage.Beverage;

public class Whip extends CondimentDecorator {

	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " / add Whip";
	}

	@Override
	public double cost() {
		return .15d + this.beverage.cost();
	}

}
