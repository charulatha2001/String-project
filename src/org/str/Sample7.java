package org.str;

public class Sample7 {
	public static void main(String[] args) {
		String s1 = "Welcome to java class";
		String[] split = s1.split("\\s");
		for (String string : split) {
			
			System.out.println(string);
			
		}
	}

}
