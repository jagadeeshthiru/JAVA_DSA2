package com;

public class Equal {
   public static void main(String[] args) {
	
	   String s="hello13323kfbk321kdjsk";
	   String s1="";
	   for(int x=0;x<=s.length()-1;x++)
	   {
		   char ch=s.charAt(x);
		   if(ch>='0'&&ch<='9')
		   {
			   s1=s1+ch;
		   }
	   }
	   System.out.println(s1);
	   StringBuffer sb=new StringBuffer(s1);
	   sb.reverse();
	   System.out.println(sb);
	   if(s1.contentEquals(sb))
	   {
		   System.out.println("Palindrome");
	   }
	   else
	   {
		   System.out.println("Not palindrome");
	   }
}
}
