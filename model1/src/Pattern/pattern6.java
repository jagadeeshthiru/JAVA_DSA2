package Pattern;

public class pattern6 {
	public static void main(String[] args) {
		int rows=5,cols=5,temp=rows+1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1||r+c==temp||r==rows||c==1||c==rows||r==c)
				System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
	}
}
}
