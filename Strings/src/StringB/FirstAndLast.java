package StringB;

public class FirstAndLast {
public static void main(String[] args) {
	String s="hello alL good morning";
	String a[]=s.split(" ");//[]
    for (int i = 0; i < a.length; i++) {
    	String sn="";
		String str = a[i];
		for (int j = 0; j < str.length(); j++) {
			
			char ch=str.charAt(j);
			if(j==0||j==str.length()-1)
			{
				if(ch>='a'&&ch<='z')
				sn=sn+(char)(ch-32);
				else
					sn=sn+ch;

				
			}
			else if(ch==' ')
			{
				sn=sn+ch;
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
