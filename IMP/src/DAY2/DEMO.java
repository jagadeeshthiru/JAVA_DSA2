package DAY2;

public class DEMO {
public static void main(String[] args) {
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			int num=50,n=1;
			while(n<=num)
			{
			   int temp=n,rev=0;
				while(n!=0)
				{
					int rem=n%10;
					rev=rev*10+rem;
					n=n/10;
				}
				n=temp;
				if(n==rev)
				{
					if(c==1||r==5||r==c)
					{
						System.out.print(n+" ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				n++;
		}
		
	}
		
		System.out.println();
	}
}}

