
package org.jayden.design.decorator.case1.beverage;

public class Espresso extends Beverage{

	public Espresso() {
		this.description = "Esspresso";
	}
	
	@Override
	public double cost() {
		return 1.99d;
	}

}
