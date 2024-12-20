package Inheritance;

public class Main {
public static void main(String[] args) {
	Animal a1=new Animal("Tiger",'M',"Yellow",7);
	a1.displayAnime();
    Lion l1=new Lion("Indian",120);
    l1.displayLion();
    l1.displayAnime();
}
}
class Animal
{
	String name;
	char Gender;
	String color;
	int size;
	Animal()
	{
		
	}
	Animal(String name, char gender, String color, int size) {
		this.name = name;
		Gender = gender;
		this.color = color;
		this.size = size;
	}
	void displayAnime()
	{
		System.out.println(this.name+" "+this.Gender+" "+this.color+" "+this.size);
	}	
}
class Lion extends Animal
{
  
	String bread;
    int weight;
    Lion(String bread,int weight)
    {
    	
    	//super();
    	//super("Lion",'F',"Biscut",5);
    	this.bread=bread;
    	this.weight=weight;	
    }
    public void displayLion()
    {
		System.out.println(super.name+" "+super.Gender+" "+super.color+" "+super.size+" "+bread+" "+weight);

    }
    
}
