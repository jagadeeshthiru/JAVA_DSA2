package Polymorphism;

public class Demo {
   public static void main(String[] args) 
   {
	Demo d1=new Demo();
	d1.main();
	d1.main(10);
   }
   public void main()
   {
	 System.out.println("Hello java");  
   }
   public void main(int a)
   {
	   System.out.println("iam: "+a);
   }
}
