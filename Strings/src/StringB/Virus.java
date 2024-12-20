package StringB;

public class Virus {
public static void main(String[] args) {
	String s= "virtual information resource under size";
	String str[]=s.split(" ");
	String s2="";
	for(int x=0;x<=str.length-1;x++)
	{
		String s1=str[x];
		//System.out.println(s1);
		s2=s2+s1.substring(0,1);
		System.out.println(s2);
		
	}
	
}
}
