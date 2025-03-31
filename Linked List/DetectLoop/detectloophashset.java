// package DSA.LinkedList.DetectLoop;

import java.util.HashSet;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class detectloophashset {
    // Function to detect a loop using HashSet
    public static boolean detect(Node head) {
        // Create a HashSet to store visited nodes
        HashSet<Node> vis = new HashSet<>();

        // Traverse the linked list
        while (head != null) {
            // If the node is already in the set, a loop is detected
            if (vis.contains(head)) {
                return true;
            }

            // Add the current node to the set
            vis.add(head);

            // Move to the next node
            head = head.next;
        }
        // No loop found
        return false;
    }

    // Function to print the linked list (for debugging)
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a linked list with a loop
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next; // Creates a loop at node 3

        // Detect loop in the linked list
        if (detect(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
