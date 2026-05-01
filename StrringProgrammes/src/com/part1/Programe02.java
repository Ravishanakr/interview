package com.part1;

//Remove Special characters from string
// java&4@1.!Super&^

public class Programe02 {

	public static void main(String[] args) {

		// approach-1

		String s1 = "This#string%containsspec^ial*characters&.";

		String res = "";

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) > 64 && s1.charAt(i) <= 122) {

				res = res + s1.charAt(i);
			}

		}

		System.out.println(res);

		// approach-2
		String s2 = "This#string%contains^special*characters&.";

		s2 = s2.replaceAll("[^a-zA-Z0-9]", " ");

		System.out.println(s2);

	}

}
