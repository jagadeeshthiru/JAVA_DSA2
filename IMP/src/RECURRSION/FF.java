package RECURRSION;
class mm
{
	public void fac(int n,int s,int c)
	{
		
		if(s<=n)
		{
			if(n%s==0)
			{
				c++;
			}
			fac(n,s+1,c);
		}
		else
		{
			System.out.println(c);
			if(c==2)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}
	}
}
public class FF {
public static void main(String[] args) {
	mm m1=new mm();
	m1.fac(12,1,0);
}
}
