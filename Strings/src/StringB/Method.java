package StringB;

public class Method {
public static void main(String[] args) {
	//To delete the string characters
	String str="HelloAll";
	StringBuffer sb=new StringBuffer(str);
	sb.delete(2, 5);
	   System.out.println("To delete the string"+sb);
	   
	 //To reverse the string characters
	   String str1="HelloAll";
		StringBuffer sb1=new StringBuffer(str1);
	sb1.reverse();
	System.out.println("to reverse the string:  "+sb1);
	
	//To find the heighest length of strings
	String s="Hello All Good Morning";
	String a[]=s.split(" ");
	String temp="";
	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x].length()>temp.length())
		{
			temp=a[x];
		}
	}
	System.out.println(temp);
}

}
