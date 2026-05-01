package com.part2;


//remove vowels
public class Programm3 {

	public static void main(String[] args) {

		String s = "hello i love my india";

		s = s.replaceAll ("[aeiouAEIOU]", "");

		System.out.println(s);
	}

}
