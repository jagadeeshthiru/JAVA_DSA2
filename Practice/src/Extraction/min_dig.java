package Extraction;

public class min_dig {
	public static void main(String[] args) {
		int num=2345879,rem=0,min_dig=9;
		while(num!=0)
		{
			rem=num%10;
			if(min_dig >rem)
			{
				min_dig=rem;
			}
			num=num/10;
			
		}
		System.out.println(min_dig);
	}
}
