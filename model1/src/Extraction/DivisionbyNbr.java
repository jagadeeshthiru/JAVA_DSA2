package Extraction;

public class DivisionbyNbr {
   public static void main(String[] args) {
	int num=1234,rem=0,sum=0,div=0,temp=num,rev=0,sum1=0;
	while(num!=0)
	  {
		rem=num%10;
		rev=rev*10+rem;
		sum=sum+rem;
		num=num/10;
	  }
	    System.out.println(sum);
	    num=temp;
	    System.out.println(rev);
	   // System.out.println(num);
	   while(rev!=0)
	    {
		  rem=rev%10; 
		  //System.out.println(rem);
		  div=sum/rem;
		  
		  rev=rev/10; 
		  System.out.print(div);
	    }	    
     }
}
