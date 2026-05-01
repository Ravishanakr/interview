package com.part1;

//Java Program To Find First Non Repeated Character
public class Programe07 {

	public static void main(String[] args) {

		extracted();

	}

	private static void extracted() {
		String s = "AAB";

		for (int i = 0; i < s.length(); i++) {

			boolean flag = true;

			for (int j = 0; j < s.length(); j++) {

				if (i!=j && s.charAt(i) == s.charAt(j)) {

					flag = false;
					break;

				}

			}

			if (flag) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
