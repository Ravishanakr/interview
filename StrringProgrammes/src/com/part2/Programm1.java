package com.part2;

//Reverse Each Word In Given String
public class Programm1 {

	public static void main(String[] args) {
		String name = "Ravi Shankar";

		String[] split = name.split(" ");
		String rev = "";

		for (String s : split) {

			System.out.println(s);

			for (int i = s.length() - 1; i >= 0; i--) {

				rev = rev + s.charAt(i);

			}

		}

		System.out.println(rev);
		
		System.out.println("*******************");
		
		
		String s = "Hello My Friend";
		
		String[ ]  arr = s.split(" ");

		for(int i = 0; i < arr.length ; i++){
				String x = arr [ i ];							
				StringBuffer sb = new StringBuffer(x);
				sb.reverse( );
				System.out.print (sb);					
		}	
		
		
		
		
		
		
		
		
		
		
		

	}

}
