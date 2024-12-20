package Hierarical;
class Animal
{
	void eat()
	{
		System.out.println("Eat grass");
	}	
}
class cow extends Animal
{
	void milk()
	{
		System.out.println("Give Pure milk");
	}	
}
class bull extends Animal
{
	 void pull()
	 {
		 
		 System.out.println("Pull bullakrat");
	 }
}
public class Main {
public static void main(String[] args) {
	bull b1=new bull();
	b1.pull();
	b1.eat();
	cow c1=new cow();
	c1.milk();
	c1.eat();
	Animal a1 =new Animal();
	a1.eat();
}
}