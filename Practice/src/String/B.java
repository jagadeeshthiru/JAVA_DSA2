package String;

public class B {
public static void main(String[] args) {
	String s="a1b12c12";
	for(int x=0;x<s.length();x++)
	{ 
		int count=0;
		char ch=s.charAt(x);
		if(ch>='0'&&ch<='9')
		{
			int k=Character.getNumericValue(ch);
			for(int y=0;y<k;y++)
			{
			    count++;	
			}
			System.out.println(count);
		}
		else if(ch>='a'&&ch<='z')
		{
			continue;
		}
		
		
	}
}
}
