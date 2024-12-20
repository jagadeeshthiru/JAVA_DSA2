package Exp3;

public class Unique {
public static void main(String[] args) {
	String s="hello all good morning";
	char ch[]=s.toCharArray();
 String s1="";
	for (int i = 0; i < ch.length; i++) {
		
		if(s.indexOf(ch[i])!=s.lastIndexOf(ch[i]))
		{
			if(s1.indexOf(ch[i])==-1)
				s1=s1+ch[i]+" ";			
		}		
	}
	System.out.println(s1);
	
	
	
}
}
