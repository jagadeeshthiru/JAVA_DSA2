package Extraction;

public class PerfectNbr {
    public static void main(String[] args) {
		int num=135,rem=0,sum=0,power=0,rev=0,count=0,temp=num;
		while(num!=0)
		{
		   rem=num%10;
		   //System.out.println(rem);
		   rev=rev*10+rem;
		   System.out.println(rev); 
		   num=num/10;
		}
		while(rev!=0) //531
		{
			rem=rev%10; 
			count++;
			System.out.println(rem);//1 //3 //5
			power=(int)Math.pow(rem, count); //5^2 3^2
			sum=sum+power; //0+1 1+9
				
			rev=rev/10; //135/10=13 13/10=1'
			
		}
		System.out.println(sum);
		num=temp;
		if(num==sum)
		{
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is a not perfect number");
		}
		
	}
}
