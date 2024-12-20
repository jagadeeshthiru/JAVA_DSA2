package Practice;

public class IncAndDec {
    public static void main(String[] args) {
		int a[]=new int[]{18,23,135,45,65,34};
		for(int x=0;x<a.length-1;x++)
		{
			
				if(a[x]<a[x+1])
				{
					System.out.println("Increased");
				}
				else
				{
					System.out.println("Decreased");
				}
				
			
		}
    }
}
    