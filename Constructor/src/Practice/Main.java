package Practice;

public class Main {
	public static void main(String[] args) {
		Student s1=new Student("Jagadeesh",22,'D',9347792133L,71.9);
		s1.data();
	}
}
class Student
{
	String name;
	int rollno;
	char sec;
	float nbr;
	double marks;
	public Student(String name, int rollno, char sec, float nbr, double marks) {
		this.name = name;
		this.rollno = rollno;
		this.sec = sec;
		this.nbr = nbr;
		this.marks = marks;
	}
	void data()
	{
		int rollno;//local variable
		System.out.println(name+" "+this.rollno+" "+sec+" "+nbr+" "+marks);
	}	
}
