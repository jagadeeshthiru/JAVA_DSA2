package Practice;

public class Person {
	
	    String name;
	    int age;

	    // Regular constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Copy constructor (shallow copy)
	    public Person(Person other) {
	        this.name = other.name;  // Primitive field copied directly
	        this.age = other.age;    // Primitive field copied directly
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        Person person1 = new Person("Alice", 30);
	        Person person2 = new Person(person1);  // Using the copy constructor

	        person1.display();  // Output: Name: Alice, Age: 30
	        person2.display();  // Output: Name: Alice, Age: 30
	    }
	}

