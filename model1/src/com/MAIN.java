package com;
interface check
{
	void m1();
	void m2();
	void m3();	
}
interface demo
{
	void m1();
	void m2();
	void m3();
}
public class MAIN implements check,demo {
    public void m1()
    {
    	System.out.println("Iam M1 method");
    }
    public void m2()
    {
    	System.out.println("Iam m2 method");
    }
    public void m3()
    {
    	System.out.println("Iam m3 method");
    }
    
    public void m9()
	{
		System.out.println("Iam m8");
	}
    public static void main(String[] args) {
		check c1=new MAIN();
	    demo d1=new MAIN();
	    d1.m1();
		d1.m2();
		d1.m3();
		c1.m1();
		c1.m2();
		c1.m3();
		//c1.m9();
	}
    
}

