<<<<<<< HEAD
package com.bm.collectios.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Bhagvat");
		names.add("bhagvat");
		names.add("Amol");
		names.add("Ankush");
		names.add("Ajay");
		names.add("Pavin");
		System.out.println("Size :" + names.size());// 2

//		System.out.println(names.contains("bhagvat")); //true
		Iterator<String> iterator = names.iterator();

		System.out.println("syso :" + iterator);

		for (; iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
//		names.remove("bhagvat");
//		for (String ref : names) {
//			if (ref.equals("bhagvat")) {
//				names.remove(ref);

//Exception in thread "main" java.util.ConcurrentModificationException
//	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1606)
//	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1629)
//	at com.bm.collectios.set.MainApp.main(MainApp.java:25)

//			}
//			System.out.println("Name :  " + ref);
	}

//}

}
=======
package com.bm.collectios.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainApp {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Bhagvat");
		names.add("bhagvat");
		names.add("Amol");
		names.add("Ankush");
		names.add("Ajay");
		names.add("Pavin");
		System.out.println("Size :" + names.size());// 2

//		System.out.println(names.contains("bhagvat")); //true
		Iterator<String> iterator = names.iterator();

		System.out.println("syso :" + iterator);

		for (; iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
//		names.remove("bhagvat");
//		for (String ref : names) {
//			if (ref.equals("bhagvat")) {
//				names.remove(ref);

//Exception in thread "main" java.util.ConcurrentModificationException
//	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1606)
//	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1629)
//	at com.bm.collectios.set.MainApp.main(MainApp.java:25)

//			}
//			System.out.println("Name :  " + ref);
	}

//}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
