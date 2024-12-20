package DAY1;

public class FAC {
public static void main(String[] args) {
	FAC f1=new FAC();
int result=	f1.num(5, 1);
System.out.println(result);
			
}
public int num(int n,int prod)
{
	while(n>=1)
	{
		prod=prod*n;
		n--;
		
	}
	return prod;
	
}
}
