package RECURRSION;

public class NEW {
   public static void main(String[] args) {
	   String s = "HelloAllGoodMorning";  // Input string
       StringBuilder s2 = new StringBuilder();  // Using StringBuilder for efficient string concatenation

       // Checking if the string is not empty
       if (s != null && !s.isEmpty()) {
           for (int y = 0; y < s.length(); y++) {  // Loop over each character
               char c = s.charAt(y);  // Get current character
               
               // Swap case for alphabetic characters
               if (Character.isUpperCase(c)) {
                   s2.append(Character.toLowerCase(c));
               } else if (Character.isLowerCase(c)) {
                   s2.append(Character.toUpperCase(c));
               } else {
                   s2.append(c);  // Append spaces or non-alphabet characters as is
               }
           }

           // Print the result
           System.out.println(s2.toString());
       } else {
           System.out.println("Input string is empty or null");
       }
   }
	
}

