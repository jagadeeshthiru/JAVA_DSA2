package DAY1;

public class PAT1 {
	public static void main(String[] args) {
     int a[]=new int[] {10,5,7,33,22,89,373,234},k=4;
     for(int x=0;x<a.length-1;x++)
     {
    	 if(a[x]>a[x+1])
    	 {
    		 int temp=a[x];
    		 a[x]=a[x+1];
    		 a[x+1]=temp;
    		 x=-1;
    	 }
     }
     for(int temp:a)
     {
     System.out.println(temp);
     }
     int c=0;
     for(int x=0;x<=a.length-1;x++)
     {
    	 c++;
    	 if(c==k)
    	 {
    		 System.out.println("The "+k+" minimum number is: "+a[x]);
    	 }
     }
    int count=0;
     for(int x=a.length-1;x>=0;x--)
     {
    	count++;
    	if(count==k)
    	{
   		 System.out.println("The "+k+"th max number is: "+a[x]);

    	}
     }

	}
}
