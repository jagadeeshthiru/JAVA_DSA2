package DAY3;

 class D {
  
	public void m1()
	{
		System.out.println("D method");
	}
}
 public class C extends D
{
	public void m1()
	{
		System.out.println("C method");
	}
   public static void main(String[] args) {
	  // C c=new C();
	   D d=new D();
		//c.m1();
		d.m1();
}

}
