package com.part1;

import java.util.HashSet;

//Java Program To Find Longest Substring 

//Without Repeated Character

public class Programe10 {

	public static void main(String[] args) {

		String s = "abcdab";

		HashSet<Character> set = new HashSet<>();

		String longestOverall = "";
		String longestTillnow = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (set.contains(c)) {
				longestTillnow = "";
				set.clear();
			}

			set.add(c);
			longestTillnow = longestTillnow + c;

			if (longestTillnow.length() > longestOverall.length()) {

				longestOverall = longestTillnow;
			}

		}

		System.out.println(longestOverall);
	}

}
