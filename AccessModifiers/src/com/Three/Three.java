package com.Three;
import com.two.Two;
import com.one.One;
public class Three {
 
	public void m3()
	{
		System.out.println("M3 method");
	}
	public static void main(String[] args) {
		One o1=new One();
		o1.m1();
		Two t2=new Two();
		t2.m2();	
		Three t3=new Three();
		t3.m3();
	}
}
