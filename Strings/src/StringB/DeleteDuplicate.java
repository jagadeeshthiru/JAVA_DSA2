package StringB;

public class DeleteDuplicate {

	public static void main(String[] args) {
		String s="hello";
		char ch[]=s.toCharArray();
		for(int x=0;x<=ch.length-1;x++)
		{
			
			char c=ch[x];
			for(int y=x+1;y<=ch.length-1;y++)
			{
				if(ch[x]==ch[y])
				{
				    System.out.println(ch[x]);
				    
				}
			}
			//System.out.println(s);
		}
	}
}
