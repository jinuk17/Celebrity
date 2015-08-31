package org.jayden.design.factory.case1;

public class SimplePizzaFactory {

	public SimplePizzaFactory() {
	}

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		return pizza;
	}
}

