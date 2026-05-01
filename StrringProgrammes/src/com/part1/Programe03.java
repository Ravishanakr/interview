package com.part1;

//How To Remove White Spaces in a String
public class Programe03 {

	public static void main(String[] args) {

		// approach-1

		String s1 = "Ravi Shankar Derangula";

		String s2 = "";

		for (int i = 0; i <s1.length(); i++) {
			
			if (s1.charAt(i) !=' ')

			{
				s2 = s2 + s1.charAt(i);
			}

		}

		System.out.println(s2);
		
		// approach-2
		String s3 = "hello   Iam   java    Devloper";

		String replaceAll = s3.replaceAll("\\s", "");
		System.out.println(replaceAll);
		System.out.println("");

	}

}
