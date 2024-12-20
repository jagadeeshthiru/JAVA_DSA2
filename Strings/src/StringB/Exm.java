package StringB;

public class Exm {
public static void main(String[] args) {
	String s="Hello All Good Morning";
	String s1[]=s.split(" ");
	for(int x=0;x<=s1.length-1;x++)
	{
		
	      String ms="";
		String s2=s1[x];
		StringBuffer sb=new StringBuffer(s2);
		if(x%2==0)
		{
					//System.out.println(sb);
		
          for(int y=0;y<=sb.length()-1;y++)
          {
        	  char ch=sb.charAt(y);
        	  //System.out.println(ch);
        	  if(y==sb.length())
        	  {
        		  ms=ms+(char)(ch-32);
        	  }
        	  else        		  
        	  {
        		  ms=ms+(char)(ch+32);
        	  }
          }
          System.out.println(ms+" ");
		}
		else
		{
			System.out.println(sb.reverse());
		}
	}
	
}
}
