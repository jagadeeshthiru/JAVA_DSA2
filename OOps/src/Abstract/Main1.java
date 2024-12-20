package Abstract;

public class Main1 extends Atm {
	public void function()
	{
		System.out.println("it shows how to work");
	}

	public void implemnt()
	{
		System.out.println("Hiding the data");
	}
	public void data()
	{
		System.out.println("It showing data");
	}
	public void m1()
	{
		System.out.println("IAM M1");
	}
    public static void main(String[]args)
     {
	    Atm atm=new Main1();
	    atm.function();
	    atm.data();
	    atm.implemnt();
	   
     }	
}
abstract class Atm
{
	abstract void implemnt();
   abstract void data();
   public void function()
   {
	   System.out.println("It shows functionality");
   }
   
}
