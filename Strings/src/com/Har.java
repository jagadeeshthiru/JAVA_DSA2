package com;

public class Har {
	public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        String s="a1b12c12r2";
        int num=0,pro=1;
        for(int x=0;x<=s.length()-1;x++)
        {
            char c=s.charAt(x);
            if(c>='0'&&c<='9')
            {
                num=num*10+Character.getNumericValue(c);
            }
            else
            {
                if(num>0)
                {
                    pro=pro*num;
                    num=0;
                }
            }
        }
       if(num>0)
        {
            pro*=num;
       }

       System.out.println(pro);
    }
}
