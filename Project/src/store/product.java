package store;
import java.util.Scanner;
public class product {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int ac_sleeper=1400,ac_seater=700,nonac_sleeper=1200,nonac_seater=600,total=0,booking_seats=0;
	  System.out.println("welcome to Hyderabad bus stand");
	  System.out.println();
	  do
	  {
		  System.out.println("choose your destination: \n1.Vizag\n2.vijayawada \n3.Chennai\n4.benguluru");
		  System.out.println();
		  System.out.println("Enter your city");
		  int city=sc.nextInt();
		  
		  switch(city)
		  {
		  case 1:
			  System.out.println("your destination is vizag and select ticket");
			  break;
		  case 2:
			  System.out.println("your destination is vijayawada and select ticket");
			  break;
	      case 3:
			  System.out.println("your destination is chennai and select ticket");
			  break;
		  case 4:
		      System.out.println("your destination is bengaluru and select ticket");
		      break;
		     default :
		    	 System.out.println("valid data");
		  }	  
		  System.out.println("Filter your booking ticket");
		  int num=sc.nextInt();
		 		  
		  System.out.println("Enter your name");
		  String name=sc.next();
		  
		  switch (num)
		  {
		    case 1:
			        System.out.println("hello "+name+" your booking ticket is ac_sleeper");
			        System.out.println("enter booking_seats");
			         booking_seats=sc.nextInt();
			        total=total+(booking_seats*ac_sleeper);
			       
			break;
		    case 2:
		    	 System.out.println("hello "+name+" your booking ticket is ac_seater");
		    	 System.out.println("enter booking_seats");
		         booking_seats=sc.nextInt();
		        total=total+(booking_seats*ac_seater);
		        
				break;
		    case 3:
		    	 System.out.println("hello "+name+" your booking ticket is nonac_seater");
		    	 System.out.println("enter booking_seats");
		         booking_seats=sc.nextInt();
		        total=total+(booking_seats*nonac_seater);
		    	 
				break;
		    case 4:
		    	System.out.println("hello "+name+" your booking ticket is nonac_sleeper");
		    	 System.out.println("enter booking_seats");
		         booking_seats=sc.nextInt();
		        total=total+(booking_seats*nonac_sleeper);
				break;
		    

		default:
			 System.out.println("Invalid");
			break;
		}
		  System.out.println("do you want to cotinue");
		  char dec=sc.next().charAt(0);
		  if(dec=='n')
		  {
			 System.out.println("Your total bill is: "+total); 
			 System.out.println("thank you Happy journey");
			 break;
		  }
		  if(dec=='y')
		  {
			 
			  System.out.println("select city: "+city);
			  System.out.println("thank you for yourinformation");
			  System.out.println();
			  
		  }
		  
		  
	  }
	  while(true);
}     
}