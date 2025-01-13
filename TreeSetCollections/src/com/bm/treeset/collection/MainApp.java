<<<<<<< HEAD
package com.bm.treeset.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names = new TreeSet<String>();
		names.add("Bhagvat");
		names.add("Bhagvat");
		names.add("Mithali");
		names.add("Ankush");
		names.add("Ajay");
		names.add("Amol");
		names.add("Pravin");
//		System.out.println(names.size());

		Set<Account> accounts = new TreeSet<Account>();

		accounts.add(new Account(1, 299, "Bhagvat"));
		accounts.add(new Account(3, 299, "Bhagvat"));
		accounts.add(new Account(2, 299, "Bhagvat"));
		accounts.add(new Account(20, 299, "Bhagvat"));

		System.out.println(accounts.size());

		for (Account ref : accounts) {
			System.out.println(ref);
			System.out.println(ref.getAccId());
		}

//		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
////		}
//		for (int iter = 0; iter < names.size(); iter++) {
//			System.out.println(names.);
//		}

//		Iterator<String> iterator = names.iterator();
//
//		System.out.println("syso :" + iterator);
//
//		for (; iterator.hasNext();) {
//			String string = iterator.next();
//			System.out.println(string);
//		}

//		for (String string : names) {
//			System.out.println(string);
//		}

	}

}
=======
package com.bm.treeset.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> names = new TreeSet<String>();
		names.add("Bhagvat");
		names.add("Bhagvat");
		names.add("Mithali");
		names.add("Ankush");
		names.add("Ajay");
		names.add("Amol");
		names.add("Pravin");
//		System.out.println(names.size());

		Set<Account> accounts = new TreeSet<Account>();

		accounts.add(new Account(1, 299, "Bhagvat"));
		accounts.add(new Account(3, 299, "Bhagvat"));
		accounts.add(new Account(2, 299, "Bhagvat"));
		accounts.add(new Account(20, 299, "Bhagvat"));

		System.out.println(accounts.size());

		for (Account ref : accounts) {
			System.out.println(ref);
			System.out.println(ref.getAccId());
		}

//		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
////		}
//		for (int iter = 0; iter < names.size(); iter++) {
//			System.out.println(names.);
//		}

//		Iterator<String> iterator = names.iterator();
//
//		System.out.println("syso :" + iterator);
//
//		for (; iterator.hasNext();) {
//			String string = iterator.next();
//			System.out.println(string);
//		}

//		for (String string : names) {
//			System.out.println(string);
//		}

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
