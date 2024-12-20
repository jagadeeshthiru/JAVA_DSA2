package String;

public class LARGE {
public static void main(String[] args) {
	String s="hello all good morning";
	String s1[]=s.split(" ");
	int max=0;
	String str="";
	for(int x=0;x<=s1.length-1;x++)
	{	
		if(s1[x].length()>max)
		{
			str=s1[x];
			max=s1[x].length();
		}		
	}	
	System.out.println(str+" "+max);
}
}
