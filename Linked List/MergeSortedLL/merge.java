class Node {
    int val;
    Node next;

    // Constructor to create a new node
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class merge {
    
    // Function to merge two sorted linked lists
    public static Node MergeSortedLL(Node h1, Node h2) {
        // Base case: if either list is null, return the other list
        if (h1 == null) return h2;
        if (h2 == null) return h1;

        // Recursively merge the lists
        if (h1.val <= h2.val) {
            h1.next = MergeSortedLL(h1.next, h2);
            return h1; // h1 becomes the new head of the merged list
        } else {
            h2.next = MergeSortedLL(h1, h2.next);
            return h2; // h2 becomes the new head of the merged list
        }
    }

    // Utility method to print the linked list
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create two sorted linked lists for testing
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("List 1: ");
        printLL(head1);

        System.out.println("List 2: ");
        printLL(head2);

        // Merge the two sorted linked lists
        Node mergedHead = MergeSortedLL(head1, head2);

        System.out.println("Merged List: ");
        printLL(mergedHead);
    }
}
