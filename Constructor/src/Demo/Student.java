package Demo;

public class Student {
	String name;
	int roll;
	public void data2()
	{
		System.out.println("hgjkh");
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		Details d1=new Details();
		Student s2=new Student();
		s2.data2();
		System.out.println("Main Ends");
		d1.data();			
	}

}
class Details
{
	int rollno;
	String name;
	Details()
	{
		System.out.println("Iam constructor");
		rollno=10;
		name="jagadeesh";
	}
	public void data()
	{
		System.out.println(rollno+" "+name);
	}
	
}
