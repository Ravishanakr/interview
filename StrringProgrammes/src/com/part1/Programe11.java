package com.part1;

import java.util.HashSet;

//Find out if String has all Unique Characters? [
public class Programe11 {

	public static void main(String args[]) {
		boolean result = false;
		String inputstring = "Alve i@wsom";
		
		System.out.println(inputstring);
		
		HashSet<Character> uniquecharset = new HashSet<>();
		
		for (int i = 0; i < inputstring.length(); i++) {
			
			result = uniquecharset.add(inputstring.charAt(i));
			
			if (result == false)
				break;
		}
		System.out.println(result);
	}
}