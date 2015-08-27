package org.jayden.design.decorator.case1;

import org.jayden.design.decorator.case1.beverage.Beverage;
import org.jayden.design.decorator.case1.beverage.DarkRoast;
import org.jayden.design.decorator.case1.beverage.Espresso;
import org.jayden.design.decorator.case1.condiment.Mocha;
import org.jayden.design.decorator.case1.condiment.Whip;

public class CoffeShop {

	
	public static void main(String[] args) {
		
		Beverage espresso = new Espresso();
		
		System.out.println(espresso.getDescription() + " : $"+espresso.cost());
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		
		System.out.println(darkRoast.getDescription() + " : $"+darkRoast.cost());
	}

}
