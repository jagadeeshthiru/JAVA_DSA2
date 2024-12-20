package Armstrong;

public class N {
public static void main(String[] args) {
	for(int x=0;x<=400;x++)
	{
		int num=x,temp=num,rem=0,sum=0,pow=0,count=0;
		while(num!=0)
		{
			rem=num%10;
			count++;
			num=num/10;
		}
		num=temp;
		while(num!=0)
		{
			rem=num%10;
			pow=(int)Math.pow(rem, count);
			sum=sum+pow;
			num=num/10;
		}
		num=temp;
		if(sum==num)
		{
			System.out.println(num+" :Armstrong Number");
		}
		
	}
}
}
