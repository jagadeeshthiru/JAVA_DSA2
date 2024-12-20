package Practice;

public class Missing {
public static void main(String[] args) {
	int a[]=new int[]{1,2,3,4,6,8,9,4,3,10,12,14,16};
	for (int i = 0; i <=20; i++) {
		int count=0;
		for (int j = 0; j < a.length; j++) {
			if(i==a[j])
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
}
}
