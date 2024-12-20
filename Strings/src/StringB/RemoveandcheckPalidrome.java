package StringB;

public class RemoveandcheckPalidrome {
public static void main(String[] args) {
	String str="a Man 1 2 a plan @ a canal & panama";
	String s="";
	for(int x=0;x<=str.length()-1;x++)
	{
		
		char ch=str.charAt(x); //a
		if(ch>='a'&&ch<='z')//
		{
//			System.out.print(ch);a
			s=s+ch;//a
		}
		
		 //a
	}
	System.out.print(s+"\n");
	StringBuffer sb=new StringBuffer(s);//a
	sb.reverse();//a
     System.out.print(sb+"\n");
     if(s.contentEquals(sb))
     {
    	 System.out.println("Palindrome");
     }
     else
     {
    	 System.out.println("Not palindrome");
     }
 }
}

//for(int x=0;x<str.length();x++)
//{
//	String s="";
//	char ch=str.charAt(x);
//	if(ch>='a'&&ch<='z')
//	{
//		s=s+ch;	
//		System.out.println(s); 
//	}
//	
//	//System.out.print(str);
//	StringBuffer sb=new StringBuffer(s);
//	sb.reverse();
//	//System.out.print(sb);
//
//	if(sb.equals(str))
//	{
//		System.out.println("Palindrome");
//		break;
//	}
//	else
//	{
//		System.out.println("Not Palindrome");
//		break;
//	}
//	
//}
//
