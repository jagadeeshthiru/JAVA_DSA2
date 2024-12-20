package com;

public class MethodCheck {
public static void main(String[] args) {
	String s1="Hello";
	String s2="hello";
    String s3="";
	System.out.println(s1.codePointAt(0)+" "+s1.codePointAt(1));
	System.out.println(s1.contains("H")+" "+s1.contains("Ho"));
	System.out.println(s1.endsWith("0"));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.intern());
	System.out.println(s1.isEmpty());
	System.out.println(s3.isEmpty());
	//System.err.println(s1.replace(0, 0));
	System.err.println(s1.replaceAll(s2, s3));
	System.err.println(s1.replaceFirst(s3, s1));
	System.err.println(s1.startsWith(s3));
	System.err.println();

	
}
}
