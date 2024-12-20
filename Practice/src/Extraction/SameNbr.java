package Extraction;

public class SameNbr {
public static void main(String[] args) {
	int num=6500,rem=0,rev=0,rev1=0,c=0,c1=0,remains;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		c++;
		num=num/10;
		
	}
	System.out.println(c);
	System.out.println(rev);
	while(rev!=0)
	{
		rem=rev%10;
		
		rev1=rev1*10+rem;
		c1++;
		rev=rev/10;
	}
	System.out.println(rev1);
	System.out.println(c1);
	remains=c-c1;
	System.out.println(remains);
	int total=(int)Math.pow(10, remains);
	int total1=total*rev1;
	System.out.println(total1);
}

}
