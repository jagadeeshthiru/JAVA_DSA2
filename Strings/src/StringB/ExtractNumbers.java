package StringB;
//Extract the 
public class ExtractNumbers {
public static void main(String[] args) {
	String s="s1b2c3";
	char ch[]=s.toCharArray();
	int sum=0;
	for(int x=0;x<=ch.length-1;x++)
	{
		if(ch[x]>='0'&&ch[x]<='9')
		{
			int temp=Character.getNumericValue(ch[x]);
			System.out.println(ch[x]);
			
			 sum=sum+temp;
		}
		
	}
	System.out.println(sum);
}
}
