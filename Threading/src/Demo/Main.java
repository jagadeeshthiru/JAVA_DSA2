package Demo;

public class Main {
  public static void main(String[] args) {
	Demo demo=new Demo();
	demo.setName("Thread1");
	demo.start();
	Demo demo1=new Demo();
	demo1.setName("T2");
	demo1.start();
	

  }
 
}
class Demo extends Thread
{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
