package com.part2;

//Plaindrome
public class Programm2 {

	public static void main(String[] args) {

		String s = "level";
		//level,racecar

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}

		System.out.println(rev);
		if (s.equals(rev)) {

			System.out.println("Palindrom");
		}

	}

}
