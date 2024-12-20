package Extraction;

public class prime {
  public static void main(String[] args) {
	int arr[]=new int[] {2,3,4,6,1,8};
	System.out.println("dkj");
	for(int x=0;x<=arr.length-1;x+=2)
	{
		int temp=arr[x];
		arr[x]=arr[x+1];
		arr[x+1]=temp;
		//System.out.println("adj");
	}
	for(int x=0;x<=arr.length-1;x++)
	{
		int te=arr[x];
		arr[x]=arr[arr.length-1];
		arr[arr.length-1]=te;
	}
	for(int t:arr)
	{
		System.out.println(t);
		
	}	
}
}
