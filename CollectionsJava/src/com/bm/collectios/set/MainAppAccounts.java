package com.bm.collectios.set;

import java.util.HashSet;
import java.util.Set;

import com.bm.collectios.Account;

public class MainAppAccounts {
	public static void main(String[] args) {
		Set<Account> accs = new HashSet<Account>();

		accs.add(new Account(1, 1200, "Bhagvat"));
		accs.add(new Account(1, 1200, "Bhagvat"));

		System.out.println("Size :" + accs.size());

	}

}
