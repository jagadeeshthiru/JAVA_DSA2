package Demo;


public class main1 {
	main1()
	{
		this(100);
	System.out.println("Default para");	
	}
 main1(int x) {
	 this(10,20);
		System.out.println("one para");
	}
 main1(int x,int y) {
	 this(20,30,"Jagadeesh");
		System.out.println("Two Para");
	}
 main1(int x,int y,String s) {
		System.out.println("Three para");
	}
 public void m1()
 { 
	 System.out.println("hckas");
 }
 
 
public static void main(String[] args) {
	main1 main=new main1();
	main.m1();
	System.out.println("Hello All");
	
}
}
