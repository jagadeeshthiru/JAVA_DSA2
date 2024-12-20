package Practice;

public class Palindrome {
 public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,5,77,89,56,66,90,44};
	
	for(int x=0;x<a.length;x++)
	{
		int rem=0,rev=0,num=a[x],temp=num;
		while(num!=0)
		{		
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(a[x]+"is a palindrome");
		}
	}
}
}
