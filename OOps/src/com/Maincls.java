package com;
interface student {
	  void sname();
	  void marks();
	  void srollnbr();
	}
	interface Teacher
	{
		void Tid();
		void salary();
		void Tname();
	}
	
class school implements student,Teacher
{

	@Override
	public void Tid() {
		System.out.println("263528");
		
	}

	@Override
	public void salary() {
		System.out.println(23329);

		
	}

	@Override
	public void Tname() {
		System.out.println("ram");

		
	}

	@Override
	public void sname() {
		System.out.println("saran");

		
	}

	@Override
	public void marks() {
		System.out.println(35);

	}

	@Override
	public void srollnbr() {
		System.out.println(345577);

		
	}

}

public class Maincls {
public static void main(String[] args) {
	school s1=new school();
	s1.srollnbr();
	s1.salary();
	s1.sname();
	s1.Tid();
	s1.Tname();
	
}
}
