package Demo;

public class join {
	public static void main(String[] args) throws InterruptedException {
		Runnable r1=()->
		{
			for(int x=0;x<10;x++)
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t1=new Thread(r1,"satya");
		Thread t2=new Thread(r1,"vindhya");
		t1.start();
		t2.start();000
		t1.join();//It will be executed first
		
		for(int x=0;x<10;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
