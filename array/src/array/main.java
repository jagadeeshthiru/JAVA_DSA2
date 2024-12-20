package array;

public class main {
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=20;
		arr[1]=53;
		arr[2]=60;
		arr[3]=87;
		arr[4]=90;
		int sum=0;
		int prod=1;
		System.out.println(arr.length);
		System.out.println(	);
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("the array"+x+"="+arr[x]);
			if(x%2==0)
			{
				sum=sum+arr[x];
			}
			else
			{
				prod=prod*arr[x];
			}
		}
		System.out.println();
		System.out.println("the sum :"+sum);
		System.out.println("the prodis :"+prod);
	}
}
