package com.bm.test2.que1;

public class Pattern {
	public static String getPattern(String patternInp) {
		String op = null;
		StringBuilder sb = new StringBuilder();
		char currentChar = 0;
		char[] inputCharArray = patternInp.toCharArray();
		for (char ch : inputCharArray) {
			if (Character.isAlphabetic(ch)) {
				currentChar = ch;
			} else {
				int cnt = Integer.parseInt(String.valueOf(ch));
				while (cnt > 0) {
					sb.append(currentChar);
					cnt--;
				}
			}
		}
		op = sb.toString();
		return op;

	}
}
