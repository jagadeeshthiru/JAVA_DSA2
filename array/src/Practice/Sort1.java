package Practice;

public class Sort1 {
public static void main(String[] args) {
	int a[]=new int[] {50,22,33,44,56,30};
	for (int i = 0; i < a.length-1; i++) {
		
	
			if(a[i]>a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
				i=-1;
				
			}
				
	}
	for (int temp : a) {
		System.out.print(temp+" ");
		
	}
	for(int x=a.length-2;x>=0;x--)
	{
		if(a[x]<a[a.length-1])
		{
			System.out.println("2nd largest elemnt is: "+a[x]);
			break;
		}
	}
}
}
