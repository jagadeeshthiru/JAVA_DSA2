package Extraction;

public class Perfectnumber {
    public static void main(String[] args) 
     {
	   int num=135,rem=0,rev=0,count=0,power=0,sum=0,temp=num;
	   int i=1;
	    for(;i<=num;)
	    {
	    	rem=num%10;
	    	num/=10;
	    	rev=rev*10+rem;
	    	System.out.println(rem);
	    }
	    System.out.println();
	    for(;rev!=0;) //531
	    {
	    	rem=rev%10; 
	    
	    	count++; //1 
	    	System.out.println(rem); //1
	    	power=(int)Math.pow(rem, count);  
	    	System.out.println("the power is: "+power);
	    	sum=sum+power;
	    	rev/=10;
	    }
	    System.out.println(sum);
	 
	    System.out.println("the number is: "+temp);
	    if(sum==temp)
	    {
	    	System.out.println("it is a perfect number");
	    }
	    else 
	    {
	    	System.out.println("it is not perfect number");
	    }
	    
     }
}
