package Extraction;

public class ReverseNbr {
	public static void main(String[] args) {
		int num=231,rem=0,rev=0;
//		System.out.print(num+"\n");
//		while(0<num)
//		{
//			rem=num%10;
//			num=num/10;
//			System.out.print(rem);
//			
//			
//		}
		
		while(0<num)
		{
			rem=num%10;  //3 //
			rev=rev*10+rem; //1 //13 //2
			num=num/10; //23 //2
		}
		System.out.println(rev);
	}

}
