package com;

public class Duplicate {
	public static void main(String[] args) {
		String s="Hello Al123l22";
		char a[]=s.toCharArray();
		char b[]=new char[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=1;	
			if(b[i]==1)
				continue;
			
        for (int j = i+1; j < a.length; j++) 
        {
	             if(a[i]==a[j])
	             {
	            	 count++;
	            	 //System.out.println(a[j]);
	            	b[j]=1;
	             }
	            
               }
       
        
			if(count>1)
			{
				System.out.println(count+" "+a[i]);
			}
			//System.out.println(a[i]);
		}
   }
}

