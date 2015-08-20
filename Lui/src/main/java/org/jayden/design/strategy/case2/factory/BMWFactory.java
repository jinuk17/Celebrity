package org.jayden.design.strategy.case2.factory;

import org.jayden.design.strategy.case2.Car;

public class BMWFactory implements CarFactory {

	public Car makeCar() throws Exception {
		return new Car("BMW", "50000원");
	}

}
