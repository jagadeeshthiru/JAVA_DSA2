package com;

public class Rev {
 public static void main(String[] args) {
	String s="hello world";
	String s1[]=s.split(" ");
	String sn=" ";
	for(int x=0;x<=s1.length-1;x++)
	{
		String str=s1[x];
		//System.out.println(str);
		for(int y=str.length()-1;y>=0;y--)
		{
			char ch=str.charAt(y);
		     System.out.print(ch);
		    
		}
		System.out.print(" ");
		
	}
}
}
