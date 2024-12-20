package Practice;

public class Armstrng {
public static void main(String[] args) {
	int a[]=new int[]{153,370,6587,9474,456};
	
	int rem=0,rev=0,pow=0;
	for (int i = 0; i < a.length; i++) 
	{
		int num=a[i],temp=num,count=0,sum=0;
		while(num!=0)//num>0
		{
			rem=num%10;	
			count++;
			num=num/10;//0
		}
		num=temp;
		while(num!=0)
		{		
		rem=num%10;
	    pow=(int)Math.pow(rem,count);
	    sum=sum+pow;
		num=num/10;
		}
		num=temp;//153
		if(temp==sum)
			System.out.println(temp);
}
	
	}
	
}

