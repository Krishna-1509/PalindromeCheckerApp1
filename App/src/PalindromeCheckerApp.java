/*
 * UseCase3PalindromeCheckerApp.java
 * UC3: Palindrome Check Using String Reverse
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "racecar";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);  // Concatenating each character
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}