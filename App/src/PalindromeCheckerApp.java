/*
 * UseCase11PalindromeCheckerApp.java
 * UC12: Strategy Pattern for Palindrome Algorithms
 */

import java.util.Stack;
import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Create an object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker(word);

        // Check palindrome
        if (checker.checkPalindrome()) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");

        sc.close();
    }
}