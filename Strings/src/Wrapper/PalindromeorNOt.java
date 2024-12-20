package Wrapper;

public class PalindromeorNOt {
public static void main(String[] args) {
	String s="12122";
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	System.out.println(sb);
	if(s.contentEquals(sb))
	{
		System.out.println("P");
	}
	else
	{
		System.out.println("n");
	}
	
}
}
