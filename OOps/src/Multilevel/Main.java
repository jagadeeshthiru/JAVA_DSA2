package Multilevel;
public class Main {
public static void main(String[] args) {
	Tigerbaby t1=new Tigerbaby();
	t1.mowm();
	t1.bread();
	t1.eat();
	Animal a1=new Animal();
	a1.eat();
	Tiger t=new Tiger();
	t.eat();
	t.eat();     
}
}
class Animal
{
	String type;	
	Animal()
	{
	   type="BEGLOOOOO";
	   System.out.println(type);
		System.out.println("WILD SAALE");
	}
	Animal(int size)
	{		
		this();
		System.out.println("lived in forest");
	}
	void eat()
	{   
		System.out.println("Eat food");
	}
	void gender(char ch)
	{
		System.out.println("The animal gender is:  "+ch);
		System.out.println("The type of animal is: "+type);
	}
	
}
class Tiger extends Animal
{	
	void bread()
	{
		System.out.println("bengal tiger");
	}
	Tiger()
	{		
		super(10);
	System.out.println("The colour of animal is yellow balce shade");	
	}
}
class Tigerbaby extends Tiger
{	
	void mowm()
	{   
		
		super.bread();
		System.out.println("newly born baby");
	}
}