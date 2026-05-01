package com.part1;

//Java Program To Replace Character With It's Occurrence
public class Programe06 {

	public static void main(String[] args) {

		String text = "Hello All GoodMorining";

		char replace = 'l';

		if (text.indexOf(replace) == -1) {
			System.out.println("Given charecter not availibale in string");
		}

		int count = 1;

		for (int i = 0; i < text.length(); i++) {

			char c = text.charAt(i);

			if (c == replace) {

				text = text.replaceFirst(String.valueOf(c), String.valueOf(count));

				count++;
			}

		}

		System.out.println(text);

	}

}
