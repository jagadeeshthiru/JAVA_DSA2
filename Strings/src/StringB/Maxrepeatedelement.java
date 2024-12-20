package StringB;

public class Maxrepeatedelement {
   public static void main(String[] args) {
	String s="Hello all Good morning all";
	String a[]=s.split(" ");
	for(int x=0;x<=a.length-1;x++)
	{
		int count=0;
		if(a[x]==1)
			continue;
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]==a[y])
			{
				count++;
				
			}
			if(count>1)
			{
				System.out.println(a[x]);
			}
		}
		
		
			
		
	}
}
}
