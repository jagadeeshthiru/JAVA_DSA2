package com;

public class SSS {
  public static void main(String[] args) {
	String s="Hii Venky";
	String s1="";
	for(int x=0;x<=s.length()-1;x++)
	{
		char ch=s.charAt(x);
		if(ch>='A'&&ch<='Z')
		{
			s1=s1+(char)(ch+32);
		}
		else
		{
			s1=s1+(char)(ch-32);
		}
	}
	System.out.println(s1);
}
}
