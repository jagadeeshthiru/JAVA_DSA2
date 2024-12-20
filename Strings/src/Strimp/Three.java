package Strimp;

public class Three {
   public static void main(String[] args) {
	//String s=new String("hello");
	String s1="hello";
    String rev="";
	for (int i = 0; i < s1.length(); i++)
	{
		char ch=s1.charAt(i);
		rev=rev+ch;	
	}
	System.out.println(rev);
	if(rev==s1)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	if(rev.equals(s1))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
	
	
	

	
  }
}
