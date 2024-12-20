package Pattern;

public class pattern12 {
public static void main(String[] args) {
	int rows=4,cols=4,temp=0;
	for(int r=1;r<=rows;r++)
	{
		temp=r;
		for(int c=1;c<=cols;c++)
		{
			System.out.print(temp+" ");
			temp++;
		}
		System.out.println();
	}
}
}
