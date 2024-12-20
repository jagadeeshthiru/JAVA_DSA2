package RECURRSION;
class Check
{
	public void fact(int num,int start)
	{
		if(start<=num)
		{
			if(num%start==0)
			{
				System.out.println(start);
				
			}
			fact(num,start+1);
		}
	}
}
public class FACTORS {
public static void main(String[] args) {
	Check c1=new Check();
	c1.fact(10, 1);
}
}
