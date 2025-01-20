package com.bm.test2;

import com.bm.test2.que1.Pattern;
import com.bm.test2.que2.RevString;
import com.bm.test2.que3.CheckAnagram;

public class Main {
	public static void main(String[] args) {

		System.out.println(":: OP :: \nQ1 : " + Pattern.getPattern("a2b6"));
		System.out.println("Q2 : input : one two three \nOutput : " + RevString.getReverseString("one two three"));

		System.out.println("Q3 : input : arc , car : \nop : "
				+ (CheckAnagram.checkAnagramString("car", "arc") ? "Anagram " : "Not anagram"));
	}
}
