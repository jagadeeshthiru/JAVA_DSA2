package Collecton;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Vec  {
public static void main(String[] args) {
	Demo d1=new Demo();
	Sample s1=new Sample();
	Vector l1=new Vector(Arrays.asList(d1));
	Vector l2=new Vector(Arrays.asList(s1));
	
     t1.start();
     t2.start();
	Collections.synchronizedList(l1);
}
}
class Demo implements Runnable
{
	
	public  void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Hello");
		}
	}
}
class Sample implements Runnable
{
	public  void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("MORNING");
		}
	}
}
