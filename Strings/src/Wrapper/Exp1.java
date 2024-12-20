package Wrapper;

public class Exp1 {
public static void main(String[] args) {
	String str=new String("Hello9 %^$ jagaDeeshn 6554");
	
	for(int x=0;x<=str.length()-1;x++)
	{
		char ch=str.charAt(x);
		if(Character.isDigit(ch))
		{
			
			System.out.println("is Digit: "+ch);
		}
		if(Character.isAlphabetic(ch))
		{
			System.out.println("Alpabetic"+ch);
		}
		if(Character.isLetterOrDigit(ch))
		{
			System.out.println("Letter or digit"+ch);
		}
		if(Character.isLowerCase(ch))
		{
			System.out.println(ch);
		}
		
	}
}
}
