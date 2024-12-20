package com;

public class cs {
public static void main(String[] args)
{
	try {
   System.out.println(10/0);
	}
	catch(Exception e)
	{
		System.out.println("HANDLE");
		try
		{
		throw new ArithmeticException();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("hello");
		}
	}
   
}

}
