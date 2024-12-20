package com;

public class Tribonacci {
public static void main(String[] args) {
	int start=1,a=0,b=1,c=1,d=0,end=10;
	while(start<=end)
	{
		d=a+b+c; //0+1+1=2 1+1+2=4 1+2+4=7 2+4+7=13 4+7+13=24
		System.out.print(a+" "); //0 1 1 2 4
		a=b; //1 1 2 4
		b=c; //1 2 4 7
		c=d; //2 4 7 13
		start++;
	}
}
	
}
