package Array;

public class main {
 public static void main(String[] args) {
	int a[]=new int[] {1,32,5,6,2,76};
	String s[]=new String[] {"Hello","all","morning"};
	TEST t1=new TEST();
	TEST t2=new TEST();
	TEST t3=new TEST();
	TEST t4=new TEST();
	TEST t[]=new TEST[] {t1,t2,t3,t4};
	t1.m1();
	
}
}
class TEST
{
	TEST()
	{
		int a=10;
		String s="Jagadeesh";
		char gender='M';
		System.out.println(a+" "+s+" "+gender);
	}
	public void m1()
	{
	int a=10;
	String s="Jagadeesh";
	char gender='M';
	System.out.println(a+" "+s+" "+gender);
	}
}
