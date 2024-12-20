package array;

public class Insert {
  public static void main(String[] args) {
	  int p=4;
	  int num=23;
	  int a[]=new int[] {10,12,34,56,57,88};
	  int b[]=new int[a.length+1];
	  for(int x=0;x<p;x++)
	  {
		  b[x]=a[x];
		  
	  }
	  b[p]=num;
	  for(int x=p;x<a.length;x++)
	  {
		  b[x+1]=a[x];
	  }
	  for(int temp:b)
	  {
		  System.out.println(temp);
	  }
}
}
