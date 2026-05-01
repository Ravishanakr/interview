package com.part1;

//reverse a string
public class Programe01 {

	public static void main(String[] args) {

		String s = "Hello";

		
		char[] charArray = s.toCharArray();
		
		System.out.println(charArray);

		// Approach-1
		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.print(charArray[i]);
		}

		System.out.println("");
		// Approach-2
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

	
	
}
