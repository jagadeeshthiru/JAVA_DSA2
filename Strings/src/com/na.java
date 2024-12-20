package com;

public class na {
  public static void main(String[] args) {
   String s1="Hello";
   String s2=s1;
   
   System.out.println("Before ");
   System.out.println(s1+" "+s1.hashCode());
   System.out.println(s2+" "+s2.hashCode());
   s1=s1+" World";
   System.out.println("AFTER");
   System.out.println(s1+" "+s1.hashCode());
   System.out.println(s2+" "+s2.hashCode());
 
   
}
}
