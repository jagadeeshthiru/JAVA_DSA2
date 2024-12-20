package com;

public class maincls {
public static void main(String[] args) {
	System.out.println("1st");
	number1.add();
	number2.sub();
	System.out.println("last");
	
}
}
class number1
{
   public static int num1=11132;	
	 static void add()
	{
		 int num1=3445;
		 number2.sub();
		System.out.println("addition: "+num1);
	}
}
class number2
{
	static void sub()
	{
		int num2=3977;
		System.out.println(number1.num1);
		System.out.println("substraction"+num2);
	}
}
