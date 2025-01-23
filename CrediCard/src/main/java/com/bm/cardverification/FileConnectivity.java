package com.bm.cardverification;

public class FileConnectivity implements Connectivity {

	public boolean isCardPresent(Card ref) {
		return false;
	}

	@Override
	public boolean isValid(Card ref) {
		return isCardPresent(ref);
	}
}
