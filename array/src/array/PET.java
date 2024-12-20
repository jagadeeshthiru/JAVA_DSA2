package array;

public class PET {
public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,5,6}; //6 1 5 2 4 3
	int s=a.length;
	for(int x=0;x<=a.length-1;x++)
	{
		
		if(x%2!=0)
		{
			a[x]=a[x]-1;
			System.out.println(a[x]);
		}
		else
		{
			System.out.println(a[s-1]);
			s--;
		}
		
	
	
		
	}
}
}
