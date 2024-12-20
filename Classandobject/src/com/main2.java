package com;

public class main2 {
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public int addNum()
	{
		int c=2000,d=3000;
		return c+d;
	}
	public void addNumb(int a,int b)
	{
		System.out.println(a+b);
	}
public static void main(String[] args) {
	main2 m2=new main2();
	m2.add();
	
	int rem=m2.addNum();
	System.out.println(rem);
	m2.addNumb(100, 200);
}
}
