package Strimp;

import java.util.Arrays;
import java.util.Iterator;

public class Thirteen {
public static void main(String[] args) {
	String s="jagadeesh";
	char ch[]=new char[s.length()];
	for (int i = 0; i < s.length(); i++) {
	
		ch[i]=s.charAt(i);
		
		
	}
	System.out.println(ch);
	Arrays.sort(ch);
	for (char ch1 : ch) {
		System.out.print(ch1);
	}
	
	
	
}
}
