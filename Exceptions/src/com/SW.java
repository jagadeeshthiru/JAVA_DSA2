package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SW {
public static void main(String[] args) throws FileNotFoundException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your num");
	int num=sc.nextInt();
	switch(num)
	{
	case 1: System.out.println("Unchecked exception");
	           System.out.println(10/0);
	case 2: System.out.println("checked exception");
             FileReader file=new FileReader("\\C:\\L6\\");
             break;
	case 3:
		System.out.println("unchecked");
		throw new ArithmeticException();
		
	case 4: 
		System.err.println("checked");
		throw new FileNotFoundException("hcka");
	case 5:
		System.out.println("Handle exception1");
		
	}
}
}
