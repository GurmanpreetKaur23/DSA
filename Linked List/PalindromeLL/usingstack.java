// package DSA.LinkedList.PalindromeLL;
import java.util.Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class usingstack {
    public boolean isPalindrome(Node head) {
        Stack<Integer> s = new Stack<>();
        Node temp = head;

        // Push all elements onto the stack
        while (temp != null) {
            s.push(temp.val);
            temp = temp.next;
        }

        // Compare with popped elements from stack
        temp = head;
        while (temp != null) {
            if (temp.val != s.pop()) return false;
            temp = temp.next;
        }
        return true;
    }

    // Utility function to print a linked list
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        usingstack list = new usingstack();

        // Creating a palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        // Print the linked list
        System.out.println("Original Linked List:");
        printLL(head);

        // Check if it's a palindrome
        System.out.println( list.isPalindrome(head));  // Output: true
    }
}
