package Singlelevel;

public class Animal {
	Animal()//constructor
	{
		System.out.println("wild animal");
	}
	Animal(int x)
	{
		//this();
		System.out.println("lived in forest");
	}
	void roar()
	{
		
		System.out.println("Roaring");
	}
      public static void main(String[] args) 
      {
	   Tiger t1=new Tiger();
	   t1.eat();
	   
	   
			   
      }

}
class Tiger extends Animal
{
	String name;
	Tiger()
	{
		
		super(10);
		System.out.println("second dangerous animal");
	}
	void eat()
	{
		super.roar();
		System.out.println("hunting normal animal");
	}
}

