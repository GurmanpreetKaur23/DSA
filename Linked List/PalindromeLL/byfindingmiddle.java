// package DSA.LinkedList.PalindromeLL;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class byfindingmiddle {
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // Return the new head of the reversed list
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true; // Edge case: empty or single-node list

        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = reverse(slow);
        Node temp = secondHalf; // Save for restoring later
        Node firstHalf = head;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                reverse(temp); // Restore the original structure (optional but good practice)
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 4: Restore the original list structure (optional)
        reverse(temp);
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
        byfindingmiddle list = new byfindingmiddle();

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
        System.out.println("\nIs Palindrome? " + list.isPalindrome(head)); // Output: true
    }
}
