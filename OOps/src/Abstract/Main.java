package Abstract;

public class Main {

    public static void main(String[] args) {
    	demo demo=new demo();
        demo.work();
        demo.use();
        demo.parts();
    }     
}
class demo extends Laptop
{
   public void use()	
   {
	   System.out.println("USE FOR WORK");
   }
   @Override
   public void work()
   {
	   System.out.println("working not visible only functionality");
   }
}
abstract class Laptop
{
	public void use()
	{
		System.out.println("Multiple purpose");
	}
	abstract void work();
	public void parts()
	{
		System.out.println("Visible");
	}
}
