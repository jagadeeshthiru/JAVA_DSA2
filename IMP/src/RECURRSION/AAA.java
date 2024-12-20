package RECURRSION;

public class AAA {
	public static void main(String[] args) {
		Armst a=new Armst();
		a.arm(371, 0, 0, 0, 371, 0);
	}  public void arm(int n,int s,int c,int p,int temp,int rem)
  {
	  if(n!=0)
	  {
		 rem=n%10;
		 c++;
		 arm(n/10,s,c,p,temp,rem);
	  }
	  System.out.println(c);
  }
}
