package com;

public class main1 {
	static void m1()
	{
		System.out.println("Hello");
	}
	void m2()
	{
		this.m1();
		this.m3();
		System.out.println("all");
	}
	void m3()
	{
		System.out.println("Good Morning");
	}
public static void main(String[] args) {
	main1 m=new main1();
	m.m1();
	m.m2();
	m.m3();
}
}
