package OverRide;

public class Main {
  public static void main(String[] args) {
	parent p1=new child();
	p1.m1();
	p1.m2();
	
}
}
class parent
{
	public void m1()
	{
		System.out.println("Iam parent m1");
	}
	public void m2()
	{
		System.out.println("Iam parent m2");

	}
}
class child extends parent
{
	public void m1()
	{
		System.out.println("Iam child m1");

	}
	public void m3()
	{
		System.out.println("Iam child m3");
	}
	public void m4()
	{
		System.out.println("Iam child m4");
	}
}
