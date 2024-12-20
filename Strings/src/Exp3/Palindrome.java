package Exp3;

public class Palindrome {
public static void main(String[] args) {
	int num=121;
	String s=String.valueOf(num);
	StringBuffer sb=new StringBuffer(s);
	System.out.println(s);
	sb.reverse();
	System.out.println(sb);
	if(s.contentEquals(sb))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}	
}
}
