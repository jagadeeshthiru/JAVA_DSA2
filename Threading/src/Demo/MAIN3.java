package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class MAIN3 
{
       public static void main(String[] args)
       {
		Vector<Integer>vector=new Vector<>();
		Runnable r1=()->
		{
			System.out.println("im input");
			for(int x=0;x<5;x++)
			{
				vector.add(x);//elements add
			}
		};
		Runnable r2=()->
		{
			System.out.println("im outptu");
			for(Integer temp : vector)
				System.out.println(temp);//iterate elemeents
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();t2.start();
       }
}
