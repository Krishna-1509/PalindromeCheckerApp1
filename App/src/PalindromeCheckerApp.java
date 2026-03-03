/*
 * UseCase8PalindromeCheckerApp.java
 * UC8: Linked List Based Palindrome Checker
 */

public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check if linked list is palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using fast & slow pointers
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare first and second halves
        Node firstHalf = head;
        Node secondIter = secondHalf;
        boolean isPalin = true;
        while (secondIter != null) {
            if (firstHalf.data != secondIter.data) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondIter = secondIter.next;
        }

        // Optional: restore the list
        slow.next = reverse(secondHalf);

        return isPalin;
    }

    // Function to reverse linked list
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        String word = "madam";

        // Convert string to linked list
        Node head = new Node(word.charAt(0));
        Node current = head;
        for (int i = 1; i < word.length(); i++) {
            current.next = new Node(word.charAt(i));
            current = current.next;
        }

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}