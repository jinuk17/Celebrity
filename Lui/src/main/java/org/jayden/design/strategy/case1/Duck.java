package org.jayden.design.strategy.case1;

import org.jayden.design.strategy.case1.fly.Flyable;
import org.jayden.design.strategy.case1.quack.Quackable;

public abstract class Duck {

	private Flyable flyBehavior;
	private Quackable quackBehavior;
	
	public abstract void display();
	
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public void setFlyBehavior(Flyable flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(Quackable quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
