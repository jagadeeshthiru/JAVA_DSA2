package Practice;

public class Dead {
public static void main(String[] args) {
	Thread t1[]=new Thread[2];
	Runnable r1=()->
	{   
		try {
			t1[1].join();
		} catch (InterruptedException e) {
			
			System.out.println("t1 handle");
		}
		for(int x=0;x<5;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	};
	Runnable r2=()->
	{
		try {
		t1[0].join();
		}
		catch(InterruptedException e)
		{
			System.out.println("askjD");
		}
		for(int x=0;x<5;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	};
    
    	t1[0]=new Thread(r1,"Satya");
    	t1[1]=new Thread(r2,"jafar");

    t1[0].start();
    t1[1].start();
}
}
