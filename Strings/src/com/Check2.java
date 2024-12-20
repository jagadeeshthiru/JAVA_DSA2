package com;

public class Check2 {
//check address by using hashcode by using == and .equals.
	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(System.identityHashCode(s1));
		String s2="Hello";
		System.out.println(System.identityHashCode(s2));
		String s3="Hello";
		System.out.println(System.identityHashCode(s3));
		String s4=new String("Hello");
		System.out.println(System.identityHashCode(s4));
		String s5=new String("Hello");
		System.out.println(System.identityHashCode(s5));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s2==s4);//compare the address(846492085==1796488937)
		System.out.println(s1.equals(s5));//compare the content("Hello.equal("Hello"));





	}
}
