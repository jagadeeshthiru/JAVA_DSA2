package com;

public class Lenght {
public static void main(String[] args) {
	int num=12345;

	int rem=0,length=0;
	while(num!=0)
	{
		rem=num%10;
		length++;
		num=num/10;
		
	}
	System.out.println(length);
}
}
