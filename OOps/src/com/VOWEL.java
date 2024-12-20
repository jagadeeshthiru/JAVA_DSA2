package com;

public class VOWEL {
public static void main(String[] args) {
int num=1203,rem=0,c;
int i=1;
for(;i<=num;)
{
	rem =num%10;
	System.out.println(rem);
	num/=10;
}
}
}
