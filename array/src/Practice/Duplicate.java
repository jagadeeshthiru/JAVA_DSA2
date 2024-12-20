package Practice;

public class Duplicate {
   public static void main(String[] args) {
	int b[]=new int[]{2,33,43,89,33,2,33,43,89};
	int c[]=new int[b.length];
	for(int x=0;x<=b.length-1;x++)
	{
		int count=1;
		if(c[x]==1)
			continue;
		for(int y=x+1;y<b.length;y++)
		{
			if(b[x]==b[y])
			{
				count++;
				c[y]=1;
			}
			
			
		}
		if(count>1)
		{
			System.out.println(b[x]+" "+count);
		}
	}
   }
}
