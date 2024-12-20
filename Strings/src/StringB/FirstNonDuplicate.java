package StringB;

public class FirstNonDuplicate {
public static void main(String[] args) {
	String s="swiss";
    
	for(int x=0;x<=s.length()-1;x++)
	{
		if(s.indexOf(s.charAt(x))==s.lastIndexOf(s.charAt(x)))
		{
			System.out.println(s.charAt(x));
			break;
		}
	}
}
}
