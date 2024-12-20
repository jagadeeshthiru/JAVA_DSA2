package Pattern;

public class pattern5 {
	public static void main(String[] args) {
		int rows=5,cols=5,temp=rows+1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r+c==temp)  //1+1=6f 1+2=6f 1+3=6f 1+4==6f 1+5==6t
					//2+1=6f 2+2=6f 2+3=6f 2+4==6t 1+5==6f
					//3+1=6f 3+2=6f 3+3=6t 3+4==6f 3+5==6t....,
				System.out.print("$ ");
				else
					System.out.print("# ");
			}
			System.out.println();
	}
	}
}
