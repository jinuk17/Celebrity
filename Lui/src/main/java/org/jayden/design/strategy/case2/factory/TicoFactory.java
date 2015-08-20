package org.jayden.design.strategy.case2.factory;

import org.jayden.design.strategy.case2.Car;

public class TicoFactory implements CarFactory{

	public Car makeCar() throws Exception {
		return new Car("tico", "1000원");
	}

}
