package Extraction;

import java.util.Scanner;

public class Armstrong {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your Number");
	 int num=sc.nextInt();
	int count=0,sum=0,power=0,rem=0,temp=num;
	 while(num!=0)
	 {
		 rem=num%10;
		 count++;
		 num=num/10;
	 }
	// System.out.println(count);
	
	 
	 num=temp;
	 while(num!=0)
	 {
		 rem=num%10;
		 power=(int)Math.pow(rem, count);
		 sum=sum+power;
		 num=num/10;
	 }
	 System.out.println(sum);
	 num=temp;
	 if (num==sum)
	 {
		 System.out.println("It is armstrong number");
	 }
	 else
	 {
		 System.out.println("Not armstrong number");
	 }
}
}
