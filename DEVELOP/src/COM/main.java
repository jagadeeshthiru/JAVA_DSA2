package COM;

import java.util.Scanner;


public class main {
		  public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter your eligibility");
			String s=sc.next();
			if(s.equalsIgnoreCase("secondry"))
			{
			System.out.println("Enter your graduation");
			String g=sc.next();
			if(g.equalsIgnoreCase("12th"))
			{
				Secondary.college();
			   Secondary i1=new Secondary();
			   i1.eligible(g);
			   System.out.println("Enter your college name ");	
			   String cn=sc.next();
			   i1.cName(cn);
			   Secondary.group();
			   System.out.println("Enter your group name");
			   String B=sc.next();
			   i1.gName(B);
			}
			else if(g.equalsIgnoreCase("diplomo"))
                {
				Secondary secondary=new Secondary();
				secondary.eligible(g);
				   System.out.println("Enter your college name ");	
				   String cn=sc.next();
				   secondary .cName(cn);
				   Secondary.dcollege();
				   
                }
			else
			{
				System.err.println("Enter your valid Degree");
			}
			}
			else if(s.equalsIgnoreCase("ug"))
			{
				UG ug=new UG();
				System.out.println("Enter your graduation");
				String g=sc.next();
				ug.eligible(g);
				System.out.println("Enter your college name ");
				String in=sc.next();
				ug.cName(in);
				UG.ibname();
				System.out.println("Enter your Branch name");
				String SB=sc.next();
				ug.ibranch(SB);		
			}
			else if(s.equalsIgnoreCase("pg"))
			{
				PG pg=new PG();
				System.out.println("Enter your graduation");
				String g=sc.next();
				pg.eligible(g);
				System.out.println("Enter your college name ");
				String in=sc.next();
				pg.cName(in);
				PG.istream();
				System.out.println("Enter your Branch name");
				String SB=sc.next();
				pg.branch_and_feeStructure(SB);
			}
			else
			{
				System.err.println("Enter valid eligibility degree");
			}
		  } 
		}
		class Secondary
		{	
		public void eligible(String g)
		  {
			  System.out.println(" Your graduation degree is: "+g+" and");
			  System.out.println();	  
		  }
		public static void dcollege()
		{
			System.out.println(" THE Diplomo colleges are: 1)VISHAKA 2) AVANTHI 3)MAHARAJA "); 
			System.out.println();
		}
		  public static void college()
		  {
			System.out.println(" THE intermediate colleges are: 1)Narayana 2) chaityna 3)Tirumula "); 
			System.out.println();
		  }
		  public void cName(String n)
		  {  
			System.out.println("Your college name is: "+n);	  
		  }
		  public static void group()
		  {
			System.out.println("Your Intermediate groups are: 1)MPC 2)BIPC 3)MEC 4)OTHER");
			System.out.println();
		  }
		  public void gName(String sg)
		  {
			  System.out.println("Your groupname is: "+sg+"");
			  System.err.println("YOUR Annual fees is 50000");
		  }
		}
		class UG extends Secondary
		{
			public static void ibname()
			{
				System.out.println("Your college branches are: 1)Mechanical 2)Computer science 3)Electical");
			}
			public void ibranch(String sb)
			{		
				System.out.println("Your branch name is"+sb);
				System.err.println("YOUR Annual fees is 100000");
			}	
		}
		class PG extends UG
		{
			public static void istream()
			{
				System.out.println("Enter your streams 1)Robotics 2)AI ML&ML");		
			}	
			public void branch_and_feeStructure(String s)
			{
				 System.out.println("Your Department is: "+s);
				 System.err.println("Your fee Structure is 75000");
			}
		}


