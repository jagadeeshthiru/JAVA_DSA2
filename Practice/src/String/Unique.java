package String;

public class Unique {
   public static void main(String[] args) {
	String s="hello all good morning";
	for(int x=0;x<s.length();x++)
	{
		char ch=s.charAt(x);
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
			System.out.println(ch);
		}
	}
  }
}
