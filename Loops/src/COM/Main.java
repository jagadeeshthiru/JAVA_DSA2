package COM;

public class Main {
	public static void main(String[] args) {
		int a=20,b=40,s=1;
		while(s<=a&&s<=b)
		{
			if(a%s==0&&b%s==0)
			{
				System.out.println(s);
			}
			s++;
		}
	}
}
