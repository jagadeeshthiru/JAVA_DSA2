package Extraction;

public class EvenAndOdd {
	public static void main(String[] args) {
		int num=12345,rem=0,add2=0,add1 =0;
		while(num!=0)
		{
			rem=num%10;
			System.out.println(rem);
			if(rem%2==0)
			{
				add2=rem+2;
				System.out.println("the even rem is: "+add2);
			}
			else
			{
				add1 =rem+1;
				System.out.println("The odd rem is : "+add1);
			}
			num=num/10;
		}
		System.out.print(rem);
		
	}
	
}
