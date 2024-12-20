package com;
abstract class Hr
{
	void Salary()
	{
		System.out.println("The salary of Hr is 83599");
	}
	abstract void hrId();
	abstract void empname();
	
}
abstract class manager extends Hr
{

	@Override
	void hrId() {
		System.out.println("The Id of the hr is 87238");
		
	}
	void empname()
	{
		System.out.println("The employee name is jagguBhaai");
	}
	abstract void empnbr();
}
class Chairman extends manager
{

	@Override
	void empnbr() {
		System.out.println("tHE EMPLOyee number is 9834723964");
		
	}
	
}
public class Employee {
public static void main(String[] args) {
	Chairman c1 =new Chairman();
	c1.empname();
	c1.empnbr();
	c1.hrId();	
	c1.empnbr();
	c1.Salary();
}
}
