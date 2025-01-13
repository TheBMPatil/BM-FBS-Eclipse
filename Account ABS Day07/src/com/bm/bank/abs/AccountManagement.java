package com.bm.bank.abs;

public class AccountManagement {
	public static void withdrow(Account[] arr) {
		for (Account ref : arr) {
			ref.withdrow(0);
		}
	}
}
