<<<<<<< HEAD
package com.bm.factory.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bm.factory.Factory;
import com.bm.factory.FactoryClass;

public class MainApp {
	public static void main(String[] args) {
		File inputFile = new File("input.txt");
		System.out.println("WD : " + System.getProperty("user.dir"));
		List<Factory> vehicals = new ArrayList();

		try {
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNextLine()) {
				String input = scanner.nextLine().trim();
				Factory ref = FactoryClass.getVehical(input);
				vehicals.add(ref);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i = 1;
		for (Factory ref : vehicals) {
			System.out.println("Vehical no " + i++);
			ref.designVehical();
			ref.manifactureVehical();
		}

//		Factory ref = FactoryClass.getVehical("Bike");
//		ref.designVehical();
//		ref.manifactureVehical();

	}

}
=======
package com.bm.factory.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bm.factory.Factory;
import com.bm.factory.FactoryClass;

public class MainApp {
	public static void main(String[] args) {
		File inputFile = new File("input.txt");
		System.out.println("WD : " + System.getProperty("user.dir"));
		List<Factory> vehicals = new ArrayList();

		try {
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNextLine()) {
				String input = scanner.nextLine().trim();
				Factory ref = FactoryClass.getVehical(input);
				vehicals.add(ref);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int i = 1;
		for (Factory ref : vehicals) {
			System.out.println("Vehical no " + i++);
			ref.designVehical();
			ref.manifactureVehical();
		}

//		Factory ref = FactoryClass.getVehical("Bike");
//		ref.designVehical();
//		ref.manifactureVehical();

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
