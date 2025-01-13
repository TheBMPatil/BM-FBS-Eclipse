package com.bm.collectios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Collections sikhenge");
		List<Account> randomThings = new ArrayList();
//		List<Integer> randomThings = new ArrayList();
//		List<String> randomThings = new ArrayList();
//		List<String> randomThings = new ArrayList();
		System.out.println("Length : " + randomThings.size());
//		randomThings.add("Bhagvat is here");
//		randomThings.add(9889);
//		randomThings.add(true);
		randomThings.add(new Account(1,1200, "Bhagvat"));
		randomThings.add(new Account(2,1220, "Amol"));
		randomThings.add(new Account(3,200, "Ajay"));
		randomThings.add(new Account(4,100, "Pravin"));
//		randomThings.add(34.233);
		System.out.println("Length : " + randomThings.size());

		randomThings.remove(3);
//		List randomThings = new ArrayList();
//		System.out.println("Length : " + randomThings.size());
//		randomThings.add("Bhagvat is here");
//		randomThings.add(9889);
//		randomThings.add(true);
//		randomThings.add(new Account());
//		randomThings.add(34.233);
//		System.out.println("Length : " + randomThings.size());
//		
//		randomThings.remove(3);

//		System.out.println(randomThings.toString());

		for (int ctr = 0; ctr < randomThings.size(); ctr++) {
			System.out.println(randomThings.get(ctr).getName());
		}

		System.out.println("Length : " + randomThings.size());
//		
//		for (Iterator iterator = randomThings.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object.toString());
//
//		}

//		System.out.println( randomThings.get(0));
	}
}
