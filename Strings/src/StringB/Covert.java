package StringB;

public class Covert {
 public static void main(String[] args) {
	String s="Hello all good morning";
	
	String a[]=s.split(" ");
	for(int x=0;x<=a.length-1;x++)
	{
		String sn="";
		//System.out.print(a[x]+" ");
		String str=a[x];
		for(int y=0;y<str.length();y++)
		{
			char ch=str.charAt(y);
			if(y==0)
			{
				sn=sn+str.charAt(str.length()-1);
			}
			else if(y==str.length()-1)
			{
				sn=sn+str.charAt(0);
			}
			else
			{
				sn=sn+ch;
			}
		}
		System.out.print(sn+" ");
	}
	
 }
}
