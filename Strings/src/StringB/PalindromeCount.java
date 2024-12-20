package StringB;

public class PalindromeCount {
public static void main(String[] args) {
	String s="MADAM ARORA TEACHES MALAYALAM TO MY MOM DAD";
	String a[]=s.split(" ");
	int count=0;
	for(int x=0;x<=a.length-1;x++)
	{
	StringBuffer sb=new StringBuffer(a[x]);
	sb.reverse();
	if(a[x].contentEquals(sb))
	{
		
	   System.out.println(a[x]+" \t  +palindrome");
	   
	}
	}
}
}
