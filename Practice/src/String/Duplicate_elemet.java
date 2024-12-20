package String;

public class Duplicate_elemet {
public static void main(String[] args) {
	String s="hello all good morning";
	char a[]=s.toCharArray();
	char b[]=new char[a.length];
	int max_count=0;
	String max="";
	for(int x=0;x<=a.length-1;x++)
	{
		if(b[x]=='1')
			continue;
		int count=1;
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]==a[y])
			{
				count++;
				b[y]='1';
			}
		}
		if(count>1)
		{
			System.out.println(a[x]+" "+count);
			if(max_count<=count)
			{
				if(max_count<count)
				{
					max_count=count;
					max=max+a[x];
				}
			}
//			else
//			{
//				max_count=count;
//				max=max+" "+a[x];
//			}
		}
	}
	System.out.println("The maximum repeated is: "+max);
}
}
