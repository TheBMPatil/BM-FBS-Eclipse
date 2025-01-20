package com.bm.test2.que3;

import java.util.Arrays;

public class CheckAnagram {
	public static boolean checkAnagramString(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		
		char[] arrStr1 = str1.toCharArray();
		char[] arrStr2 = str2.toCharArray();

		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);

		for (int iter = 0; iter < arrStr1.length; iter++) {
			if (arrStr1[iter] != arrStr2[iter]) {
				return false;
			}
		}

		return true;
	}
}
