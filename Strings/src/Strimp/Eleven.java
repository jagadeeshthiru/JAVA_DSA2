package Strimp;

public class Eleven {
public static void main(String[] args) {
	String s="hello all good morning ";
	int v_c=0,C_c=0;
	for(int x=0;x<=s.length()-1;x++)
	{
		char ch=s.charAt(x);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			v_c++;
		}
		else
		{
			C_c++;
		}
	}
	System.out.println(v_c);
	System.out.println(C_c);
}
}
