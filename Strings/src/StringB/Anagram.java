package StringB;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="listen";
	String s2="silent";
	char str1[]=s1.toCharArray();
	char str2[]=s2.toCharArray();
	
		//System.out.print(str1[3]);
		//System.out.println(str2[x]);
		Arrays.sort(str2);
		Arrays.sort(str1);
		//System.out.println(str2[x]);
		//System.out.println(str1[x]);
	
	if(Arrays.equals(str1, str2))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
}
}
