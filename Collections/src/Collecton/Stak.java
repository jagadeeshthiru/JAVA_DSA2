package Collecton;

import java.util.List;
import java.util.Stack;

public class Stak {
 public static void main(String[] args) {
	 int arr[]=new int[] {10,20,32,43,23,432,43};
	Stack li=new Stack();
	for(int x=0;x<arr.length;x++)
	{
	   li.push(arr[x]);
	   
	   //li.add(arr[x]);
	}
	System.out.println(li.reversed());
	li.pop();
	System.out.println(li);
	System.out.println(li.isEmpty());
	System.out.println(li.peek());
	System.out.println(li.pop());
	System.out.println(li.search(20));
	System.out.println(li);
}
}
