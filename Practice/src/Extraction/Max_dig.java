package Extraction;

public class Max_dig {
    public static void main(String[] args) {
		int num=1345879,rem=0,max_dig=0;
		while(num!=0)
		{
			rem=num%10;
			if(max_dig<rem)
			{
				max_dig=rem;
			}
			num=num/10;
		}
		System.out.println(max_dig);
	}
}
