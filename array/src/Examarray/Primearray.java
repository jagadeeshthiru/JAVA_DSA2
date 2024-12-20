package Examarray;

class Primearray
{
     public static void main(String[]args)
     {
       int a[]=new int[]{22,33,13};
         for(int x=0;x<=a.length-1;x++)
           {
 int count=0,num=a[x];

            for(int y=0;y<=a.length-1;y++)
             {
                 if(num%x==0)
                {
                 count++;
               }
             }
            if(count==2)
            {
               System.out.println("The prime numbers: "+a[x]);
            }
          }
        
     }

}