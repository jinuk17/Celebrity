package org.jayden.design.factory.case2;

import org.jayden.design.factory.case1.Pizza;
import org.jayden.design.factory.case3.PizzaIngredientFactory;

public class NYPCheesePizza implements Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public NYPCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

	public void bake() {
		// TODO Auto-generated method stub
		
	}

	public void cut() {
		// TODO Auto-generated method stub
		
	}

	public void box() {
		// TODO Auto-generated method stub
		
	}

}
