package Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Student {
	 int id;
	String name;
	char sec;
	String email;
	double percentage;
 public Student(int id, String name, char sec, String email, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.sec = sec;
		this.email = email;
		this.percentage = percentage;
	}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", sec=" + sec + ", email=" + email + ", percentage=" + percentage
			+ "]";
}
public static void main(String[] args) {
	Student student1=new Student(10,"RAM",'A',"ram@gmail.com",93.5);
	Student student2=new Student(11,"Bheem",'C',"bheem@gmail.com",98.5);
	Student student3=new Student(10,"DEVA",'B',"deva@gmail.com",96.5);
	Student student4=new Student(12,"PUSPHA",'D',"puspha@gmail.com",100);
	ArrayList l1=new ArrayList(Arrays.asList(student1,student2,student3,student4));
Collections.sort(l1,new SortName());
    //Collections.sort(l1,new SortEmail());
	//Collections.sort(l1,new SortId());
    //System.out.print(l1);
    Iterator itr =l1.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
}
}
class SortName  implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
// class SortId implements Comparator<Student>
// {
//	 @Override
//	 public int compare(Student o1, Student o2)
//	 {
//		 return Double.compare(o1.percentage, o2.percentage);	 
//	 }
// }
