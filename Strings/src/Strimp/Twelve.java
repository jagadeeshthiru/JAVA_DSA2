package Strimp;

public class Twelve {
public static void main(String[] args) {
	String s="Hello all good morning";
	String copy="";
	for(int x=0;x<=s.length()-1;x++)
	{
		char ch=s.charAt(x);
		if(s.indexOf(ch)!=s.lastIndexOf(ch))
		{
			if(copy.indexOf(ch)==-1)
			{
				copy=copy+ch;
			}
		}
	}
	System.out.println(copy);
}
}
