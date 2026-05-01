package com.part1;

public class Basic {

	public static void main(String[] args) {

		String myStr = "This is W3Schools";
		String regex = "is";
		int count=1;
		for (int i = 0; i < myStr.length(); i++) {

			myStr=myStr.replaceAll(regex, String.valueOf(count));
			count++;
		}

		
		System.out.println(myStr);
		
		String myStr1 = "This is W3Schools";
		String regex1 = "is";
		
		myStr1=myStr1.replaceAll(regex1, "T");
		System.out.println(myStr1);

		
		
		
	}

}
