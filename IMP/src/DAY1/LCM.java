package DAY1;

public class LCM {
	
	    // main function
	    public static void main(String[] args)
	    {
	        // Numbers
	        int a = 3, b = 7;

	        // Checking for the largest
	        // Number between them
	        int ans = (a > b) ? a : b;

	        // Checking for a smallest number that
	        // can de divided by both numbers
	        while (true) {
	            if (ans % a == 0 && ans % b == 0)
	                break;
	            ans++;
	        }

	        // Printing the Result
	        System.out.println("LCM of " + a + " and " + b
	                           + " : " + ans);
	    }
	}

