package Practice;

import java.util.Iterator;

public class Ksum {
public static void main(String[] args) {
	int a[]=new int[]{10,2,5,3,-9,6,8,0,-7,2,5,1,6,4,8,-1,-4};
	int k=5;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			if(a[i]+a[j]==k)
			{
				System.out.println("("+a[i]+","+a[j]+")");
			}
		}
	}
}
}
