package Strimp;

public class ten {
public static void main(String[] args) {
	String s=" hello all good Moring.Hello all good evening.";
	int char_count=0,word_count=0,Line_count=0;
	for (int i = 0; i < s.length(); i++) {
		
		char_count++;
		char ch=s.charAt(i);
		if(ch==' ')
		{
			word_count++;
		}
		else if(ch=='.')
		{
			Line_count++;
		}
		
	}
	System.out.println(word_count);
    System.out.println(char_count);
    System.out.println(Line_count);
}
}
