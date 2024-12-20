package String;

public class Anagram {
    public static void main(String[] args) {
    	String s="listen";
    	String s1="silent";
    	char ch[] =s.toCharArray();
    	char ch1[]=s.toCharArray();
    	for(int x=0;x<ch.length-1;x++)
    	{
    		if(ch[x]>ch[x+1])
    		{
    			char temp=ch[x];
    			ch[x]=ch[x+1];
    			ch[x+1]=temp;
    			x=-1;
    		}
    	}
    	for(char c:ch)
    	{
    		System.out.println(c);
    	}
    	System.out.println();
    	for(int x=0;x<ch1.length-1;x++)
    	{
    		if(ch1[x]>ch1[x+1])
    		{
    			char temp=ch1[x];
    			ch1[x]=ch1[x+1];
    			ch1[x+1]=temp;
    			x=-1;
    		}
    	}
    	for(char c1:ch1)
    	{
    		System.out.println(c1);
    	}
	}
   
   
}
