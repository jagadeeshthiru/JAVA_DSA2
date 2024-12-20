package Polymorphism;

public class Load {

	

	      void m1()
	       {  
	          System.out.println("Iam m1");
	       }
	      //void m1(int x)
	      // {  
	      //    System.out.println("Iam int");
	       //}
	      void m1(double x)
	       {  
	          System.out.println("Iam double");
	       }
	      void m1(long x)
	       {  
	          System.out.println("Iam long");
	       }



	   public static void main (String []args)
	      {
	       Load l1;//compiletime
	       l1=new Load();
	       l1.m1();//compiletime
	        l1.m1(10);
	       char ch='a';
	        l1.m1(ch);
	      l1.m1((long)100.9);
	      }
	}

