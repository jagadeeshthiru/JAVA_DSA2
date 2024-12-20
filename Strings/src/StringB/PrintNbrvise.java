package StringB;

public class PrintNbrvise {
public static void main(String[] args) {
	String a="a1b2c3d4";
	char s=' ';
	//char a[]=s1.toCharArray();
	for(int x=0;x<=a.length()-1;x++)//a  1--->me   int a=3
	{
		char c=a.charAt(x);
		
		 if(c>='a' && c<='z')
		 {
			 s=c;
		 }
		 if(c>='1' && c<='9')
		 {
			 int k=Character.getNumericValue(c);
			for(int i=0;i<k;i++)
			{
				System.out.print(s);
			}
		 }
	}
	
}
}
