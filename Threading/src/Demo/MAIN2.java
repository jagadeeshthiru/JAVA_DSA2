package Demo;
public class MAIN2 {
	public static void main(String[] args) {
		CHECK c1=new CHECK();
		c1.start();
		FLICK f1=new FLICK();
		f1.start();
		for(int x=1;x<=10;x++)
		{
			System.out.println("DEMO");
		}
	  }
}
class CHECK extends Thread
{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Demo class");
		}
	}
}
class FLICK extends Thread
{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("FLICK");
		}
	}
}