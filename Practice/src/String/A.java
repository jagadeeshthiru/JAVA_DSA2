package String;

public class A {
public static void main(String[] args) {
	String s="abbcccdddddeeeeee";
	char c[]=s.toCharArray();
	char ch[]=new char[c.length];
	for(int x=0;x<c.length;x++)
	{
		int count=1;
		if(ch[x]==1)
		{
			 continue;
		}
		for(int y=x+1;y<c.length;y++)
		{
		   if(c[x]==c[y])
		   {
			   count++;
			   ch[y]=1;
		   }
	    }
		System.out.print(c[x]);
		System.out.print(count);
		//System.out.println(c[x]);
		
	}
}
}
