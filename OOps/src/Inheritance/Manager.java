package Inheritance;

 class Hr {
	 Hr()
	 {
		System.out.println("data"); 
	 }
public void manage()
   {
	System.out.println("Command the all team");
   }

      int salary=100000;
      int id=101;
      int mobile =84972;
   
}
public class Manager extends Hr
{
	Manager()
	{
		//super();
	    System.out.println("mannnna");
	}
	public void lead()
	{
		
		System.out.println("Leading");
	}
	
	
	public static void main(String[]args)
	{
		
		System.out.println("HELLO");
		
		Manager h1=new Manager();
		h1.manage();
	System.out.println(h1.salary);
	}
}
