/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0]; // Gets the string to process
        System.out.println(lowerCase(str)); // Prints the processed string
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String newString = ""; // Defies an empty string that will be gradually evolved into the answer string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Gets the char in the i-th place at the original string
            // Checks if the char is an upper-case letter 
            if ((ch >= 65) && (ch <= 90)) {
                ch += 32; // Converts an upper-case letter to a low-case letter by changing it's ASCII value.
            }
            newString += ch; // Adds the processed char to the processed string
        }
        return newString; // Returns the processed string
    }
}
