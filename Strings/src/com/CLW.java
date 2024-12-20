package com;

public class CLW {
public static void main(String[] args) {
	String s="Hello EveryOne Good MORNING";
	 String s1[]=s.split(" ");
	 for(int x=0;x<=s1.length-1;x++)
		{
		   String str=s1[x];
		   for(int y=0;y<=str.length()-1;y++)
		   {
			   char ch=str.charAt(y);
				if(y<=2)
				{
					System.out.print(ch+" ");
				}
		   }
		   System.out.println();
		   for(int y=0;y<=str.length()-1;y++)
		   {
			   char ch=str.charAt(y);
				if(y>=str.length()-2)
				{
					System.out.print(ch+" ");
				}
		   }
		   System.out.println();
		}
}
}
