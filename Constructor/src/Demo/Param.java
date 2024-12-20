package Demo;

public class Param {
public static void main(String[] args) {
	Employee s1=new Employee();
	Employee s2=new Employee(17,"Ram");
	s1.m1();
	s2.m1();
}
}
class Employee
{
	int rollno;
	String name;
	Employee()
	{
		rollno=10;
		name="Ravi";
	}
	Employee(int r,String s)
	{
		rollno=r;
		name=s;
	}
	void m1()
	{
		System.out.println(rollno+" "+name);
	}
}
