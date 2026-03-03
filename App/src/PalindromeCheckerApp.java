/*
 * UseCase11PalindromeCheckerApp.java
 * UC11: Object-Oriented Palindrome Service
 */

import java.util.Stack;

class PalindromeChecker {
    private String word;

    // Constructor
    public PalindromeChecker(String word) {
        this.word = word;
    }

    // Method to check palindrome using stack
    public boolean checkPalindrome() {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : word.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "level";

        // Create an object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker(word);

        // Check palindrome
        if (checker.checkPalindrome()) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}