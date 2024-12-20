package OverRide;

public class Main1 {
public static void main(String[] args) {
	Animal a;
	a=new Cow();
	a.m1();
	
}
}
class Animal
{
	public static void m1()
	{
		System.out.println("Iam animal m1 method"); //method hiding
	}
	public static void m2()
	{
		System.out.println("Iam animal m2 method");
	}
}
class Cow extends Animal
{
	public static void m1()
	{
		System.out.println("Iam child m1 method");
	}
	public static void m3()
	{
		System.out.println("Iam  child m3 method");

	}
}
