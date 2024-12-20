package com;

public class aabbbccccc {
   public static void main(String[]args)
   {
	   String s="aabbccc";
	   String s1="";
	   for(int x=0;x<=s.length()-1;x++)
	   {
		   char ch=s.charAt(x);//a  b 
		   int count=0;
		   for(int y=0;y<=s.length()-1;y++)
		   {
			   char ch1=s.charAt(y);//a a b
			   if(ch==ch1)//a==a a==a a==b b==a b==a  
			   {
				   count++;//1
			   }
		   }
		   
		   if(s1.lastIndexOf(ch)==-1)//a
		   {
			   s1=s1+ch;//a
			   s1=s1+count;//a2
			   
		   }  
	   }
	   System.out.println(s1);
	   
   }
}
