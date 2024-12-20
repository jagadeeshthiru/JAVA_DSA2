package Extraction;

public class MAXandSmax {
	public static void main(String[] args) {
		int num=16828796,max=0,rem=0,rev=0,temp=num,Smax=0;
	for(;num>0;)
		{
			rem=num%10;//6 7 8
			
				if(rem>max) //6>0  7>6 8>7
				{
					max=rem; //6 7 8
					
				}
			num/=10;
		}
	System.out.println("the maximum nbr is: "+max);
	  num=temp;
	  System.out.println(" the nbr is: "+num);
	 for(;num>0;)
	  {
		  rem=num%10;
		  if(rem>Smax&&rem!=max)//
		  {
			  Smax=rem;
			  
		  }
		  num/=10;
	  }
	  System.out.println("the second max is: "+Smax);
	}

}
