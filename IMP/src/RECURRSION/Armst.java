package RECURRSION;

public class Armst {
  public void arm1(int n,int c)
  {
	  if(n!=0)
	  {
		 
		 c++;
		 arm1(n/10,c);
		
	  }
	 System.out.println(c);
  }
  public void arm2(int n,int s,int c,int p,int temp,int rem)
  {
	  if(temp!=0)
	  {
		 rem=n%10;
		 p=(int)Math.pow(rem, c);
		 s=s+p;
		 arm2(n,s,c,p,temp/10,rem);
		
	  }
	  
	  else
	  {
		  if(s==temp)
		  {
			  System.out.println("Armstrong");
		  }
		  else
		  {
			  System.out.println("Not armstrong");
		  }
	  }
	 
  }

  
}
class ch
{
	public static void main(String[] args) {
		Armst a=new Armst();
		a.arm1(371, 0);
		a.arm2(371, 0, , 0, 0, 0);
	}  
 }

