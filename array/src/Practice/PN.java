package Practice;

public class PN {
public static void main(String[] args) {
	int arr[]=new int[] {2,33,24,55,33,22,56,9};
	
	for(int x=0;x<=arr.length-1;x++)
	{
		int rem=0,rev=0;
		int num=arr[x];
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println(rev);
		num=temp;
		if(num==rev)
		{
			System.out.println(num+" :Palindrome");
		}
		
	}
}
}
