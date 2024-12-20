package RECURRSION;

public class FAB {
  public void fabo(int n,int c,int a,int b,int s)
  {
	  if(s<=n)
	  {
		  c=a+b;
		  System.out.println(a);
		  a=b;b=c;
		  fabo(n,c,a,b,s+1);
	    
				  
	  }
	  
  }
public static void main(String[] args) {
   FAB f1=new FAB();
   f1.fabo(13, 0, 0, 1, 1);
}
}
