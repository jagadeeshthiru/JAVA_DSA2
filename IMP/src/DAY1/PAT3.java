package DAY1;

public class PAT3 {
	public static void main(String[] args) {
		int rows=5,col=4 ;
		char ch='A';
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
			System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
}
}
