/*
 * UC13: Performance Comparison of Palindrome Algorithms
 */

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromePerformanceComparison {

    // Stack Method
    public static boolean stackPalindrome(String word) {
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

    // Deque Method
    public static boolean dequePalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    // Two Pointer Method
    public static boolean twoPointerPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Stack Performance
        long start1 = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long end1 = System.nanoTime();

        // Deque Performance
        long start2 = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        long end2 = System.nanoTime();

        // Two Pointer Performance
        long start3 = System.nanoTime();
        boolean pointerResult = twoPointerPalindrome(word);
        long end3 = System.nanoTime();

        System.out.println("Input Word: " + word);

        System.out.println("\nStack Method Result: " + stackResult);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Method Result: " + dequeResult);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nTwo Pointer Method Result: " + pointerResult);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}