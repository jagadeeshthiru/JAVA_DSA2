package Demo;

public class DeadLock {
  public static void main(String[] args) {
   Thread t[]=new Thread[2];
   Runnable r1=()->
   {
	   try
	   {
		   t[1].join();
	   }
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	   for(int x=0;x<10;x++)
	   {
		   System.out.println(Thread.currentThread().getName());
	   }
   };
   Runnable r2=()->
   {
	   try
	   {
		   t[0].join();
	   }
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	   for(int x=0;x<10;x++)
	   {
		   System.out.println(Thread.currentThread().getName());
	   }
   };
   t[0]=new Thread(r1,"Satya");
   t[1]=new Thread(r2,"JAFAR");
   t[0].start();
   t[1].start();
   
}
}
