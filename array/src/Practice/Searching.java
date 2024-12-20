package Practice;

public class Searching {
public static void main(String[] args) {
	int a[]=new int[] {10,22,3,45,6,45},search=45;
	int count=0;
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]==search)
		{
			count++;
			System.out.println(search+" :is found in array element: "+count+" :Times");
		}
		
	}
	
if(count==0)
{
	System.out.println(search+"element not found");
}
}
}
