package com.bm.test2.que2;

public class RevString {
	public static String getReverseString(String inputString) {

		String[] splitedString = inputString.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int iter = splitedString.length - 1; iter >= 0; iter--) {
			sb.append(" " + splitedString[iter]);
		}
		return sb.toString();
	}
}
