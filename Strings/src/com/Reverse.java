package com;

import java.util.Iterator;

public class Reverse {
public static void main(String[] args) {
	String s="Hello";
	
	for(int x=s.length()-1;x>=0;x--)
	{
		
		System.out.print(s.charAt(x));
		
	}
	System.out.println();
	int vowel=0,conconent=0;
	for(int x=0;x<=s.length()-1;x++)
	{
		
		if(s.charAt(x)=='a'||s.charAt(x)=='e'||s.charAt(x)=='i'||s.charAt(x)=='o'||s.charAt(x)=='u')
		{
			System.out.println(s.charAt(x)+" is vowel");
			 vowel++;
		}
		else if(s.charAt(x)=='A'||s.charAt(x)=='E'||s.charAt(x)=='I'||s.charAt(x)=='O'||s.charAt(x)=='U')
		{
			System.out.println(s.charAt(x)+" capital is vowel");
		conconent++;
		}
		else
		{
		
			System.out.println(s.charAt(x)+" Is a conconent");
		}
		
	}
	System.out.println(vowel);
	System.out.println(conconent);
}
}
