/*
 * UseCase5PalindromeCheckerApp.java
 * UC5: Stack-Based Palindrome Checker
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "radar";

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters from stack to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
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