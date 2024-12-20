package Kthlargest;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter your array size");
		int n=sc.nextInt();
		System.out.println("Enter your array values");
		int a[]=new int[n];
		for(int x=0;x<n;x++)
		{
			a[x]=sc.nextInt();	
			
		}
		for(int num:a)
		{
			System.out.println(num);
		}
		System.out.println("Enter your kth value");
		int kth=sc.nextInt();
		for(int x=0;x<n-1;x++)
		{
			if(a[x]>a[x+1])
			{
				int t=a[x];
				a[x]=a[x+1];
				a[x+1]=t;
				x=-1;
			}
		}
		for(int t:a)
			System.out.println(t+" ");
		count=0;
		for(int x=n-1;x>0;x--)
		{
			if(a[x]>a[x-1])
			{
				count++;
				if(count==kth)
					System.out.println(kth+" max value in the array is "+ a[x]);
			}
		}
		count=0;
		for(int x=0;x<n-1;x++)
		{
			if(a[x]<a[x+1])
			{
				count++;
				if(count==kth)
					System.out.println(kth+" min value in the array is "+ a[x]);
			}
		}
		

	}

}