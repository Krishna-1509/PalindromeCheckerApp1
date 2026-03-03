/*
 * UseCase4PalindromeCheckerApp.java
 * UC4: Character Array Based Palindrome Check
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "level";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}