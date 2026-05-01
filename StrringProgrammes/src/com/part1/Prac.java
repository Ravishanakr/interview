// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package com.part1;

import java.util.HashSet;

public class Prac {
	public static void main(String[] args) {
		String s = "abcdab";

		String longestSubString = "";
		String longestOverall = "";
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {

			char charAt = s.charAt(i);

			if (set.contains(charAt)) {
				longestSubString = "";
				set.clear();
			}

			set.add(charAt);
			longestSubString = longestSubString + charAt;

			if (longestSubString.length() > longestOverall.length()) {
				longestOverall = longestSubString;
			}

		}
		System.out.println(longestOverall);
	}
}