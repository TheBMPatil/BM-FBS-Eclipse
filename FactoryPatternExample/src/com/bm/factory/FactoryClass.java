<<<<<<< HEAD
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
=======
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
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
