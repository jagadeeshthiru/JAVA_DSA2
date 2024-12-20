package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EXP {
   public static void main(String[] args) {
	 EX e1=new EX();
	 try {
	 e1.m1();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Finak");
	 }
}
}
class EX
{
	public void m1() throws FileNotFoundException
	{
		try {
		FileReader file=new FileReader("\\kjssl.txt");
		}
		catch(Exception ae)
		
		{
			System.out.println("File handle");
			throw new FileNotFoundException();
		}
	}
}
