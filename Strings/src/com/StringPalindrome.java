package com;

public class StringPalindrome {
public static void main(String[] args) {
	String str="MADAM=";
	String rev="";
	for(int x=str.length()-1;x>=0;x--)
	{
		char ch=str.charAt(x);
		rev=rev+ch;
		
	}
	System.out.println(rev);
	if(rev.equals(str))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");

}
}	