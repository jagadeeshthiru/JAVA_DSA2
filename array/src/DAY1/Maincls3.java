package DAY1;

public class Maincls3 {
public static void main(String[] args) {
	int a[]= new int[] {10,2,5,3,-9,6,8,0,-7,2,5,1,6,4,8};
	//int b[]= new int[a.length];
	int k=5,sum=0;
	for(int x=0;x<=a.length-1;x++)//10
	{
//		if(b[x]==1)
//			continue;
		for(int y=x+1;y<=a.length-1;y++)
		{
			sum=a[x]+a[y];
			if(sum==k)
			{
				//b[y]=1;
				System.out.println("("+a[x]+","+a[y]+")");
			}        			
		}	
	}
}
}
