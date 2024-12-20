package String;

public class ODD {
    public static void main(String[] args) {
		String s="hello all good morning";
		for(int x=0;x<=s.length()-1;x++)
		{
			char ch=s.charAt(x);
		   if(x%2==0)
		   {
			    ch=(char)(ch-32);
		   }
		   System.out.print(ch);
		}
	}
}
