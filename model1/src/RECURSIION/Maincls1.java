package RECURSIION;

public class Maincls1 {
public static void main(String[] args) {
	//natural numbers 
	Armst a1=new Armst();
	a1.sum(10, 0, 1);
	     
		
}
}

class Armst
{
	void sum(int num,int sum,int start)
	{ //10 0 1
		
		if(start==num+1)  //1=10+1
		
			System.out.println(sum);
			
		
		else
		{
		   sum=sum+start; //0+0=
		   sum(num,sum,start+1);
		}
		
	}
	}

