package Interface;

interface Bank
{
	public void withdraw();
	default void intrest()
	{
		System.out.println("The comman intrest");
	}
	public static void m1()
	{
		System.out.println("Iam m1 method ");
	}
	public static final int num=5000;
}
public class Demo implements Bank {

	public static void m1()
	{
		System.out.println("Iam child m1 method ");
	}
	@Override
	public void withdraw() {
		System.out.println("The with draw amount is "+num);
		
	}
   public static void main(String[] args) {
	Demo demo=new Demo();
	demo.withdraw();
	demo.intrest();
}
}
