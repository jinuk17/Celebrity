package org.jayden.design.strategy.case1;

import org.jayden.design.strategy.case1.fly.FlyWithWings;
import org.jayden.design.strategy.case1.quack.Quack;

public class JaydenDuck extends Duck{

	@Override
	public void display() {
		System.out.println("Good ~");
	}
	
	public void doSomething() {
		this.display();
		this.performQuack();
		this.performFly();
	}

	public static void main(String[] args) {
		
		JaydenDuck jDuck = new JaydenDuck();
		jDuck.setFlyBehavior(new FlyWithWings());
		jDuck.setQuackBehavior(new Quack());
		
		jDuck.doSomething();
	}

}
