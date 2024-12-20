package Exp3;

public class Main {
public static void main(String[] args) {
	//No of words 
	String s=" hello all good morning ";
	//String str[]=s.split(" ");
	int count=0;
	for(int x=0;x<s.length();x++)
	{
		char ch=s.charAt(x);
	    if(ch==' ')
	    {
	    	count++;
	    }
	}
	System.out.println(count);
}
}
