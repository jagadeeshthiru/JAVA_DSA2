package Practice;

public class met {
   public static void main(String[] args) {
	Runnable r=()->
	{int count=0;
	    for(int x=0;x<5;x++)
	    {  count++;
	    synchronized(met.class) {
	    	System.out.println(Thread.currentThread().getName()+" "+count);
	    	//System.out.println("Hello"+" "+count);
	    }
	    }
	};
	Thread t1=new Thread(r,"Suresh-----------");
	Thread t2=new Thread(r,"jhzdvvjhvsdklgsdluadsgul");
	t1.start();
	t2.start();
}
}
