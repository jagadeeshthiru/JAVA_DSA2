package DAY1;

public class NN {
public static void main(String[] args) {
	
	int num=234,rem=0,count=0,sum=0,pow=0,temp=num;
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
		count--;
	}
	System.out.println(sum);
}
}
