package org.jayden.design.strategy.case2;

import org.jayden.design.strategy.case2.factory.BMWFactory;
import org.jayden.design.strategy.case2.factory.CarFactory;
import org.jayden.design.strategy.case2.factory.TicoFactory;

public class CarMarket {

	/*
	 * Before  
	public Car displayCar(String carName) throws Exception{
		CarFactory factory = null;
		
		if("tico".equals(carName)) {
			factory = new TicoFactory();
		}else {
			factory = new BMWFactory();
		}
		
		return factory.makeCar();
	}
	
	public static void main(String[] args) throws Exception{
        CarMarket market = new CarMarket ();
        Car ticoCar = market.displayCar("tico");
        System.out.println(ticoCar.getName() + " : "+ ticoCar.getPrice());
   	}
	*/
	
	/*
	 * After
	 */
	 
	public Car displayCar(CarFactory carFactory) throws Exception {
		return carFactory.makeCar();
	}
	
	public static void main(String[] args) throws Exception{
		CarMarket market = new CarMarket();
		Car ticoCar = market.displayCar(new TicoFactory());
		System.out.println(ticoCar.getName() + " : "+ ticoCar.getPrice());
	}
}
