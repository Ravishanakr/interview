package com.part2;

//swap two Strings
public class Programm6 {

	public static void main(String... args) {

		String words1 = "Hello             My        Friend";

		String replaceAll = words1.replaceAll("\\s+", " ");

		System.out.println(replaceAll);
		
		 String[] split = replaceAll.split("\\s");
		
		 System.out.println("**********");
		for (String s : split) {

			System.out.println(s);

		}

	}

}
