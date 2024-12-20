package DAY3;

public class JAGGED {
public static void main(String[] args) {
	int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	for(int x=0;x<a.length;x++)
	{
		int sum=0;
		for(int y=0;y<a[x].length;y++)
		{
			sum=sum+a[x][y];
			
			System.out.print(a[x][y]);
		}
		System.out.println(" sum= "+sum);
		System.out.println();
	}
}
}
