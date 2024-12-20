package com;

import java.util.Scanner;

public class Check {
public static void main(String[] args) {
	int cap_count=0,small_count=0,num_count=0,symbol_count=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String element");
	
	String str=sc.nextLine();
	for(int x=0;x<=str.length()-1;x++)
	{
		char ch=str.charAt(x);
		if(ch>='a'&&ch<='z')
		{
			small_count++;
		}
		else if(ch>='A'&&ch<='Z')
		{
			cap_count++;
		}
		else if(ch>='0' &&ch<='9')
		{
			num_count++;
		}
		else
		{
			symbol_count++;
		}
	}
	System.out.println("The total small letter are "+small_count);
	System.out.println("The total capital letter are "+cap_count);
	System.out.println("The total Number letter are "+num_count);
	System.out.println("The total Symbol letter are "+symbol_count);

}
}
