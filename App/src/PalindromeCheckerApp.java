/*
 * UseCase10PalindromeCheckerApp.java
 * UC10: Case-Insensitive & Space-Ignored Palindrome Checker
 */

public class PalindromeCheckerApp {

    // Function to check palindrome ignoring case and spaces
    public static boolean isPalindrome(String word) {
        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer technique
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";

        // Call palindrome checker
        if (isPalindrome(word)) {
            System.out.println("The phrase \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The phrase \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}