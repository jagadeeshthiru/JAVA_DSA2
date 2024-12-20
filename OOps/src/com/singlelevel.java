package com;

public class singlelevel {
public static void main(String[] args) {
	System.out.println("main starts.....1");
	
	m2 mar1=new m2();
	
	mar1.semMarks(10);
	mar1.midMarks();
	mar1.semMarks();
	
	
	
}
}
class m1
{
	int x=20;
	void semMarks(int x)
	{
		
		System.out.println("congurgulation you are 1st");
		System.out.println(x);
	}
	void midMarks()
	{
		System.out.println("hello you  marks are good");
	}
}
class m2 extends m1
{
	void semMarks()
	{
		System.out.println("congurgulation you are 5th");
	}
	void midMarks()
	{
		System.out.println("hello you  marks are not");
	}
}