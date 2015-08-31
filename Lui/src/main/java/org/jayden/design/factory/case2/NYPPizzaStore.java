package org.jayden.design.factory.case2;

import org.jayden.design.factory.case1.Pizza;
import org.jayden.design.factory.case3.NYPizzaIngredientFactory;

public class NYPPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYPCheesePizza(new NYPizzaIngredientFactory());
		}else if(type.equals("pepperoni")) {
			pizza = new NYPPepperoniPizza();
		}
		
		return pizza;
	}

}
