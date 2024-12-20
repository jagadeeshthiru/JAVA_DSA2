package Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class MAI {
	int id;
	String name;
	MAI(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "MAI [id=" + id + ", name=" + name + "]";
	}
public static void main(String[] args) {
	MAI m1=new MAI(1,"JSGK");
	MAI m2=new MAI(3,"DCHBBA");
	MAI m3=new MAI(2,"KHVBDL");
	MAI m4=new MAI(4,"JSGDVK");
	ArrayList al=new ArrayList(Arrays.asList(m1,m2,m3,m4));
    Collections.sort(al, new SortNames());
    Iterator itr=al.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
}
}
class SortNames implements Comparator<MAI>
{
	public int compare(MAI o1,MAI o2)
	{
		return o1.name.compareTo(o2.name);
	}	
}
