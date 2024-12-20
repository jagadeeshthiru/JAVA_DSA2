package String;

public class revt {
	public static void main(String[]args)
    {
           String s="Hello all Good morning";
           String s1[]=s.split(" ");
           
        for(int x=0;x<s1.length;x++)
          {
        	char ch = 0;
             String sn="";
              String str=s1[x];
          if(x%2==0)
           { 
             for(int y=0;y<str.length();y++)
              {
                 ch=str.charAt(y);
                  
                      if(ch>='a'&&ch<='z')
                        {
                            sn=sn+(char)(ch-32);
                        }
                       else if(ch>='A'&&ch<='Z')
                         {
                             sn=sn+(char)(ch+32);
                         }
                       else
                          {
                             sn=sn+ch;
                          }
                    }
              }
          else
          {
        	  StringBuffer sb=new StringBuffer(s1[x]);
        	  sb.reverse();
        	  System.out.println(sb);
        	  
          }
          System.out.println(sn);
             
             
          }
                }

}
