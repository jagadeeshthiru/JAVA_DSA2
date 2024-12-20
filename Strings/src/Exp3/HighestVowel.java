package Exp3;
import java.io.FileNotFoundException;
public class HighestVowel {
public static void main(String[] args) {
	String s="hello all good morningeveryone";
	String s1[]=s.split(" ");
	int max2=0;
	int min=9;
	String sss="";
	String sss1="";
	String temp="";
	for(int x=0;x<=s1.length-1;x++)
	{	
		String ss="";	
		int count=0;
		String arr=s1[x];
		//System.out.println(arr);
		for(int y=0;y<=arr.length()-1;y++)
		{
			char ch=arr.charAt(y);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				ss=ss+ch;
				count++;			
			}			
		}
		sss=arr;
			if(max2<count)
			{
				sss1=sss;			
				temp=ss;
				max2=count;
			}
			if(max2<=count)
			{
				min=count;
				sss1=sss;
			}
	}
	System.out.println("The heighest string word is: "+sss1+" "+max2);
	System.out.println("The lowest String word is: "+sss1+" "+min);
}
}
