package com.part1;

//sorting string
public class Programe05 {

	public static void main(String[] args) {

		String x = "bac";

		char temp;

		char[] charArray = x.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			for (int j = i; j < charArray.length; j++) {

				if (charArray[i] > charArray[j]) {

					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;

				}

			}
		}

		
		System.out.println(charArray);
		
	}

}
