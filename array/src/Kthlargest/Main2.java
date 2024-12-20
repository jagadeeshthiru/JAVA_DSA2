package Kthlargest;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an elements of Array");
		for(int x=0;x<n;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int num:a)
		{
			System.out.println(num);
		}
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
		System.out.println();
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("Enter K number");
		int k=sc.nextInt();
		int count=0;
		for(int x=n-1;x>=0;x--)
		{
			count++;
			if(k==count)
			{
				System.out.println("The kth max number is:"+a[x]);
			}
		}
		count=0;
		for(int x=0;x<=n-1;x++)
		{
			count++;
			if(k==count)
			{
				System.out.println("The kth min number is:"+a[x]);
			}
		}
		
	}
}
