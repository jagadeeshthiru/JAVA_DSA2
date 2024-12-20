package String;

public class Firstandlast {
   public static void main(String[] args) {
	 String s="Hello all good morning";
	 String s1[]=s.split(" ");
	 
	 for(int x=0;x<=s1.length-1;x++)
	 {
		String sp="";
		String str=s1[x];
		for(int y=0;y<=str.length()-1;x++)
		{
			char ch=str.charAt(y);
			if(y==0||y==str.length()-1)
			{
//				if(ch>='a'&&ch<='z')
//				{
//					sp=sp+(char)(ch-32);
//				}
//				else
//				{
//					sp=sp+ch;
//				}
			}
			else if(ch==' ')
			{
				sp=sp+ch;
			}
			else
			{
				sp=sp+ch;
			}
		}
		System.out.println(sp+" ");
		
	 }
  }
}
