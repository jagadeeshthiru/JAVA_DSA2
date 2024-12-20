package com;

public class CAN {
	public void m1()
	{
		
	}
public static void main(String[] args) {
	CAN C=new CAN();
	demo d1=new demo();
	C.m1();
	d1.m2(1000);
}
}
class demo
{
	
 void m2(double x)
	{
		System.out.println(x);
	}
}
