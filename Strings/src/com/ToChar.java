package com;

public class ToChar {
public static void main(String[] args) {
	String s="Hello Al123l";
	char a[]=s.toCharArray();
	int count=0;
	for (int i = 0; i < a.length; i++) {
		
//		if(a[i]>='0'&&a[i]<='9')
//		{
//			count++;
//			System.out.println(a[i]);
//			
//		}
//		if(a[i]!=' ')
//		{
//		System.out.println(a[i]);
//		}
		
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				count++;
				System.out.println(a[j]);
			}
			
		}
		if(count>1)
		{
			System.out.println();
		}
		
	}
	
	System.out.println("Total count is: "+count);
		
	}
	
}
