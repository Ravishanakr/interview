package com.part1;

import java.util.HashMap;
import java.util.Map;

//Java Program To Find Occurrence Of Each Character
public class Programe08 {

	public static void main(String[] args) {

		String s = "Ravi Shankar";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : s.toCharArray()) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}

			else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

	}

}
