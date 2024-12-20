package com;

public class CAPtoLOW {
public static void main(String[] args) {
	String s="HeLlo AlL gOod MorniNg";
	
	for(int x=0;x<=s.length()-1;x++)
	{
		char ch=s.charAt(x);
		if(ch>='A'&&ch<='Z')
		{
		   ch=	(char) (ch+32);
		}
		else if(ch>='a'&&ch<='z')
		{
			ch=(char) (ch-32);
		}
		System.out.println(ch);
	}
	
			
}
}
