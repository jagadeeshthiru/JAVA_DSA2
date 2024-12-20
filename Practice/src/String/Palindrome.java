package String;

public class Palindrome {
   public static void main(String[] args) {
	String s="Madam";
	String rev="";
	for(int x=s.length()-1;x>=0;x--)
	{
		char ch=s.charAt(x);
		rev=rev+ch;
	}
	System.out.println(rev);
	if(s.equalsIgnoreCase(rev))
	{
		System.out.println(s+" is palindrome");
	}
	else
	{
		System.out.println(s+" is not palindrome");
	}
  }
}
