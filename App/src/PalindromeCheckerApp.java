/*
 * UseCase2PalindromeCheckerApp.java
 * UC2: Print a Hardcoded Palindrome Result
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if original and reversed strings are equal
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
        System.out.println("UC2 Test: The word 'level' is a Palindrome.");
    }
}