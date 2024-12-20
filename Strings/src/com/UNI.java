package com;

public class UNI {
public static void main(String[] args) {
	String s="hello all good morning all";
	String s1[]=s.split(" ");
	for(int x=0;x<s1.length;x++)
	{
		String str=s1[x];
		char ch=s.charAt(x);
		if(s.indexOf()==s.lastIndexOf(ch))
		{
			System.out.println(ch);
		}
	}
}
}
