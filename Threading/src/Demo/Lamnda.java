package Demo;

public class Lamnda {
	int count;
   public static void main(String[] args) {
	   Lamnda l=new Lamnda();
	Runnable r1=()->
	{
		
		for(int x=1;x<=10;x++)
		{
			System.out.println(Thread.currentThread().getName()+(++l.count));
		}
		
	};
	
	Thread t1=new Thread(r1,"RAM");
	Thread t2=new Thread(r1,"satya");
	 t1.start();
	 t2.start();
}
   
}
