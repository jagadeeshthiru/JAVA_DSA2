package StringB;
public class Panagram {
public static void main(String[] args) {
	String s1="the quick brown fox jumps over the lazy dog";
	String s[]=s1.split(" ");
	int count=0;
	String t="";
	for(int x=0;x<=s.length-1;x++)
	{
	
	    String str=s[x];
	    for(int y=0;y<=str.length()-1;y++)
	    {
	    	char ch=str.charAt(y);
	    	//System.out.println(ch);
	    	if(ch>='a'&&ch<='z')
	   	       {
	   		       t=t+ch;	   		    
	   	       }	    	 
	    }	 
	}
	//System.out.println(t);
	char c[]=t.toCharArray();
	boolean b[]=new boolean[c.length];
	for(int x=0;x<=c.length-1;x++)
	{
		
	     if(b[x]==true)	     
	    	 continue;
	     count++;
	     for(int y=x+1;y<=c.length-1;y++)
	     {	    	
	    	 if(c[x]==c[y])
	    	 {	    		
	    		b[y]=true;
	    	 }
	     }
	    
	     
	}
	System.out.println(count);
	if(count==26)
	{
		System.out.println("It is panagram");
	}
	else
		System.out.println("It is Not Panagram");	
}
}
