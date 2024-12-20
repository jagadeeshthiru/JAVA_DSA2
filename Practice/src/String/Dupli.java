package String;

public class Dupli {
	 public static void main(String[] args) {
			String s="hello all good morning";
			String s2="";
			for(int x=0;x<s.length();x++)
			{
				char ch=s.charAt(x);
				if(s.indexOf(ch)!=s.lastIndexOf(ch))
				{
					if(s2.indexOf(ch)==-1)
					{
						s2=s2+ch;
					}
					
				}
			}
			System.out.println(s2);
		  }
}
