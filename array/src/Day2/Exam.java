package Day2;

public class Exam {
	public static void main(String[] args) {
		subject s1=new subject();
		s1.average();
		s1.percentage();
		s1.min();
		s1.max();	
	}	

}

class subject
{
	double tel=70,eng=80,maths=98,hindi=97,science=80,social=100,smin=0,smax=0;
	double total=tel+eng+maths+science+social+hindi;
	public void min()
	{
	    int a[]=new int[]{80,60,98,97,50,100};
	    for(int x=0;x<a.length;x++)
	    {
	    	if(a[x]<a[x+1])
	    	{
	    		smin=a[x];
	    		System.out.println("the minimum marks:"+smin);
	    		break;
	    		
	    	}
	    	
	    }
	    
	}
	public void max()
	{
		int a[]=new int[]{80,70,98,97,80,100};
	    for(int x=0;x<a.length;x++)
	    {
	    	if(a[x]>a[x+1])
	    	{
	    		smax=a[x];
	    		System.out.println("The maximum marks:"+smax);
	    		break;
	    		
	    	}
	    	
	    }
	}
	
	public void percentage()
	{
		double percentage=(total/600)*100;
		System.out.println("total percentage of marks: "+percentage);
	}
	public void average()
	{
		System.out.println(total);
		System.out.println("total Average  of marks: "+total/6);

	}
	
}