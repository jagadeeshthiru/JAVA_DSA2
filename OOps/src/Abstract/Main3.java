package Abstract;

public class Main3 extends Check {//Important
//    Main3(){
//	   System.out.println("Iam Main3 constructor");
//    }
    public void m1()
    {
    	System.out.println("Iam m1 method");
    }
    public static void main(String[] args) {
		Check check=new Main3();
		check.m1();
	}
}
abstract class Check
{
	Check()
	{
		System.out.println("Iam check comstructor");
	}
	abstract void m1();
	
}

