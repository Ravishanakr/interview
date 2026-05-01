package com.part1;

//remove duplicates from string
public class Programe04 {

	public static void main(String[] args) {

		String s1 = "Hello All";
		int count = 0;
		String res = "";

		for (int i = 0; i < s1.length(); i++) {

			String s = "" + s1.charAt(i);

			if (res.contains(s)) {
				count++;
				continue;
			}

			res = res + s;

		}
		System.out.println(res);
		System.out.println(count);

	}
}