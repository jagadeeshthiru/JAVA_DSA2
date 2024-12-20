package Practice;

public class Exchange {
public static void main(String[] args) {
	int a[]=new int[]{10,20,30,40,50,60,70};
	for (int i = 0; i < a.length-1; i=i+2) {
		int t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
	}
	if(a.length%2!=0)
	{
		int t=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=t;
	}
	for (int temp : a) {
		System.out.print(temp+" ");
	}
	}
  }

