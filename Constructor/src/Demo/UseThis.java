package Demo;

public class UseThis {
  public static void main(String[] args) {
	Teacher t1=new Teacher(22,"srn","srn@gamil.com","mat","mimbai");
	t1.m1();
}
}
class Teacher
{
	int id;
	String name,emailid,sub,location;
	public Teacher(int id, String name, String emailid, String sub, String location) {
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.sub = sub;
		this.location = location;
	} 
	void m1()
	{
		System.out.println(id+" "+name+" "+emailid+" "+sub+" "+location);
	}
}
