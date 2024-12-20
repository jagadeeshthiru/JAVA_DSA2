package DAY2;

public class PA {
public static void main(String[] args) {
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int n=1;
	   for(int c=rows;c>=2;c--)
	   {
		   if(r==c||r==1||c==rows)
		   {
			   System.out.print(n+" ");
			   n++;
		   }
		   else
		   {
			   System.out.print(" ");
		   }
	   }
	 
	   System.out.println();
	}
}
}
