/*
 * UseCase9PalindromeCheckerApp.java
 * UC9: Recursive Palindrome Checker
 */

public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String word, int start, int end) {
        // Base condition: crossed indices
        if (start >= end) return true;

        // If characters at start and end do not match
        if (word.charAt(start) != word.charAt(end)) return false;

        // Recursive call moving towards the center
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "racecar";

        // Call recursive palindrome checker
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}