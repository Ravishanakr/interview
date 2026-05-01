package com.part2;

import java.util.Arrays;

/*Two Strings are called the anagram if they contain the 
 * same characters. However, the order or sequence of the 
 * characters can be different.
*/public class Programm4 {

	public static void main(String[] args) {

		String str1 = "Brag";
		String str2 = "Grab";

		String lowerCase = str1.toLowerCase();
		String lowerCase2 = str2.toLowerCase();

		System.out.println(lowerCase);
		System.out.println(lowerCase2);

		
		if (lowerCase.length() != lowerCase2.length()) {
			System.out.println("Not anagram");
		}

		else

		{

			char[] charArray = lowerCase2.toCharArray();

			char[] charArray2 = lowerCase.toCharArray();

			Arrays.sort(charArray);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray, charArray2)) {
				System.out.println("anagram");

			} else {

				System.out.println("Not anagram");
			}

		}

	}

}
