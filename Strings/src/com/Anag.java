package com;

import java.util.Arrays;

public class Anag {
public static void main(String[] args) {
   String s="listen";
   String s1="silent";
   char ch[]=s.toCharArray();
   char ch1[]=s1.toCharArray();
   for(int x=0;x<ch.length;x++)
   {   
	   for(int y=x+1;y<ch.length;y++)
	   {
		  if(ch[x]>ch[y])
		  {
			  char temp=ch[x];
			  ch[x]=ch[y];
			  ch[y]=temp;			  
		  }
	   }
   }
   
   for(int x=0;x<ch1.length;x++)
   {
	   
	   for(int y=x+1;y<ch1.length;y++)
	   {
		  if(ch1[x]>ch1[y])
		  {
			  char temp=ch1[x];
			  ch1[x]=ch1[y];
			  ch1[y]=temp;
			  
		  }
	   }
   }
   for(char temp:ch)
   {
	  System.out.println(temp); 
   }
   System.out.println();
   System.out.println();
   for(char temp1:ch1)
   {
	  System.out.println(temp1); 
   }
   System.out.println();
   System.out.println();
   if(Arrays.equals(ch, ch1))
   {
	   System.out.println("Anagram");
   }
   else
   {
	   System.out.println("Not anagram");
   }
}
}
