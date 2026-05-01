package com.part1;

public class ConvertCharToString {

	public static void main(String[] args) {

		//convert char to String
		
		char c1 = 's';

		String s = String.valueOf(c1);

		System.out.println(s);

		String str = "" + c1;
		System.out.println(str);

		// convert char array to String
		char[] c2 = { 'a', 'f', 'r', 'q' };

		System.out.println(String.valueOf(c2));
		System.out.println(String.copyValueOf(c2));
		System.out.println(new String(c2));
		System.out.println(String.valueOf(1));


	}

}
