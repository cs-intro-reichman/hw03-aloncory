/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0]; // Gets the string to process
        System.out.println(uniqueChars(str)); // Prints the processed string
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String newString = ""; // Defies an empty string that will be gradually evolved into the answer string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Gets the char in the i-th place at the original string
            // Adds all the space characters from the original string to the processed string
            if (ch == 32) {
                newString += ch; // Adds the char to the processed string
            } else {
                // Removes all the duplicate characters of the original string that are not space characters 
                if (s.indexOf(ch) == i) {
                    newString += ch; // Adds the char to the processed string
                }
            }
        }
        return newString; // Returns the processed string
    }
}
