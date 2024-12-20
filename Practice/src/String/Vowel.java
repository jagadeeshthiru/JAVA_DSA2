package String;

public class Vowel {
   public static void main(String[] args) {
	String s="hello all";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		//System.out.println(ch);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("The small letter  vowel are: "+ch);
		}
		else
		{
			System.out.println("The consonents are: "+ch);

		}
	}
   }
}
