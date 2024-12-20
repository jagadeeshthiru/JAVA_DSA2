package Interface;

interface A
{
	public void m1();
	public void m2();
	public void m3();
}
interface B
{
	int add(int x);
	String name(String s);
	char gender(char ch);
}
abstract class A_B implements A,B
{
	A_B()
	{
	System.out.println("Hello all");
	}
	@Override
    public void m1()
    {
    	System.out.println("Iam m1 method");
    }

	@Override
	public void m2()
	{
		System.out.println("Iam m2 method");
	}
	public void m3()
	{
		System.out.println("Iam m3 method");
	}
	
}
class practice extends A_B
{
    
	@Override
	public int add(int x) {
		return x;
	}

	@Override
	public String name(String s) {
		return s;
	}

	@Override
	public char gender(char ch) {
		 return ch;
	}
	public void m10()
	{
		System.out.println("HELLO");
	}
	
}
public class Sample {
public static void main(String[] args) {
     practice practice=new practice();
     A_B ab=new practice();
     ab.m1();
     System.out.println(practice.add(10));
     System.out.println(practice.name("Jagadeesh"));
     System.out.println(practice.gender('M'));
     practice.m1();
     practice.m2();
     practice.m3();
    
}
}
