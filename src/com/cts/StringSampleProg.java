package com.cts;

public class StringSampleProg {
	
	public static void main(String[] args) {
		
		//           0123456
		String s1 = "Welcome";
		System.out.println(s1);
		
		//StringRefName.stringMethod();
		
		//Return type ---> control + 2 release press L
		
		//To find the length of the given string 
		int len = s1.length();
		System.out.println(len);
		
		//To change the given string into upperCase
		String upperCase = s1.toUpperCase();
		System.out.println(upperCase);
		
		//To change the given string into lowerCase
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		//To find the index position of the given char
		int indexOf = s1.indexOf('e');
		System.out.println(indexOf);
		
		//TO find the last occurrence of the given char
		int lastIndexOf = s1.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		//To find the char by passing the index
		char charAt = s1.charAt(2);
		System.out.println(charAt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
