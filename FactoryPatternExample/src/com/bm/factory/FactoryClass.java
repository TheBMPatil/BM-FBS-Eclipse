package com.bm.factory;

import com.bm.factory.vehical.Bike;
import com.bm.factory.vehical.Car;

public class FactoryClass {

	public static Factory getVehical(String vehicalType) {
		if (vehicalType.equalsIgnoreCase("Car")) {
			return new Car();
		} else if (vehicalType.equalsIgnoreCase("Bike")) {
			return new Bike();
		} else {
			return null;
		}
	}

}
