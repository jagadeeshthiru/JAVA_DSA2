package DAY2;

public class PAT {
  public static void main(String[] args) {
	  int c1=0;
	for(int x=2;x<=50;x++)
	{
		
		int n=x,count=0,num;
		for(int y=2;y<=n;y++)
		{
			
			if(n%y==0)
			{
				count++;
				
			}
			
		}
		if(count==1)
		{ 
			
		    if(c1%2==0)
		    {
			System.out.println(n);
		    }
		    c1++;
		}
		
	}
}
}
