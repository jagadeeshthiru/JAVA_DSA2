package Practice;

public class Demo
{
	public static void main(String[]args)
	  {
		 main main =new main();
		  main.start();
		
		  check ch=new check();
		  ch.start();
		  
		  for(int x=0;x<5;x++)
		  {
			  System.out.println("demo");
		  }
	  }
  
  
  
}
class main  extends Thread
{
	public void run()
	  {
		 for(int x=0;x<5;x++)
		 {
			 System.out.println("min");
		 }
	  }
	
}
class check extends Thread
{
	public void run()
	{
		for(int x=0;x<5;x++)
		 {
			 System.out.println("check");
		 }
	}
}
