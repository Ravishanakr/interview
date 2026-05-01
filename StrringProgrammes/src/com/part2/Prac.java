package com.part2;

import java.util.HashMap;
import java.util.Map;

public class Prac {

	public static void main(String[] args) {
		String s = "Ravi Shankar";

		Map<Character, Integer> map = new HashMap<>();

		char[] charArray = s.toCharArray();

		for (Character c : charArray) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}

		}

		System.out.println(map);
	}

}
