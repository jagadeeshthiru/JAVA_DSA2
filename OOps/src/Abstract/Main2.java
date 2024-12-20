package Abstract;

public class Main2 {
   public static void main(String[] args) {
	   Sample1 sample=new emo1();
			sample.m5();
			sample.m2();
			sample.m3();
	}
}
class emo1 extends Sample1
 {
	public static void m1()
	 {
	   System.out.println("Iam m1 method");
	 }
	public void m2()
	 {
	    System.out.println("Iam m2 method");
	 }
	 public void m3()
	 {
	   System.out.println("Iam m3 method");
	 }
  }
	abstract class Sample1
	 {
			public void m2()
			{
			    System.out.println("Iam m2");
			}
			abstract  void m3();
			public void m5()
			{
				System.out.println("Iam M5 method");
			}
	 }
