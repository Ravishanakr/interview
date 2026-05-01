package com.part2;

//word count
public class Programm5 {

	public static void main(String... args) {

		String words1 = "Hello    Hello           My        Friend";
		String replaceAll = words1.replaceAll("\\s", "");
		System.out.println(replaceAll);
		System.out.println("Length "+replaceAll.length());


		/*
		 * The 's' replaces one space match at a time but the 's+' replaces the whole
		 * space sequence at once with the second parameter.
		 */

		String words2 = "Hello    Hello           My        Friend";
		String replaceAll2 = words2.replaceAll("\\s+", " ");
		System.out.println(replaceAll2);

	}

}
