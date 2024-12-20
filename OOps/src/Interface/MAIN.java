package Interface;
interface Hotel
{
	 void m1();
	 void m2();
	default int add(int a,int b)
	 {
		 return a+b;
	 }
	 public static int mul(int a,int b)
	 {
		 return a*b;
	 }
}
public class MAIN implements Hotel {

	@Override
	
	
	public  void m1()   //Highest scope and visibility
	{
		System.out.println("Biryani");
	}
	public  void m2() //Highest scope and visibility
	{
		System.out.println("pasta");
	}
	public static void main(String[]args)
	{
		Hotel h1=new MAIN();
		h1.m1();
		h1.m2();
		int add_result=h1.add(10, 20);
		System.out.println(add_result);
		int mul_result=Hotel.mul(20, 10);
		System.out.println(mul_result);
	}
	
	 
}
