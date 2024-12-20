package Practice;

public class Imp {
	public static void main(String[]args)
	  {
		 Mainn mainn =new Mainn();
		 Thread t1=new Thread(mainn);
		 Thread t2=new Thread(mainn);
		  t1.start();
		  t2.start();
		  for(int x=0;x<5;x++)
		  {
			  System.out.println("demo");
		  }
	  }
}

class Mainn  implements Runnable
{
	public void run()
	  {
		 for(int x=0;x<5;x++)
		 {
			 System.out.println("min");
		 }
	  }
	
}
