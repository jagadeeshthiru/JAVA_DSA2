package StringB;

public class PalindromeIgnoreCae {
public static void main(String[] args) {
	String s="Madam Arora teaches Malayalam To My Mom and Dad";
	String a[]=s.split(" ");
	
	
	for(int x=0;x<=a.length-1;x++)
	{
		String rev="";
		String temp=a[x];
		//System.out.println(temp);
		for(int y=temp.length()-1;y>=0;y--)
		{
			char ch=temp.charAt(y);
			rev=rev+ch;
			
		}
		if(rev.equalsIgnoreCase(temp))
		{
			System.out.println(rev);
		}
	}
}
}
