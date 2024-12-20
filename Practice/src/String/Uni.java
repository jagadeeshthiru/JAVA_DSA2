package String;

public class Uni {
  public static void main(String[] args) {
	String s="helloaa00"
			+ ""
			+ ";
	String cp="";
	for(int x=0;x<s.length();x++)
	{
		char ch= s.charAt(x);
		if(s.indexOf(ch)!=s.lastIndexOf(ch))
		{
			if(cp.indexOf(ch)==-1)
			{
				cp=cp+ch;
			}
		}
	}
	System.out.println(cp);
}
}
