import java.util.HashSet;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class removecycle {
    public void remove(Node head) {
        if (head == null) return;

        // Step 1: Detect Cycle using Floyd’s Cycle-Finding Algorithm
        Node slow = head, fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                isCycle = true;
                break;
            }
        }

        if (!isCycle) return; // No cycle found


        slow = head;
        if (slow == fast) { 
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

       
        fast.next = null;  
    }

    // Utility function to print a linked list safely
    public static void printLL(Node head) {
        HashSet<Node> visited = new HashSet<>();
        Node temp = head;
        while (temp != null) {
            if (visited.contains(temp)) {
                System.out.print("(Cycle detected) STOP\n");
                return;
            }
            visited.add(temp);
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removecycle list = new removecycle();

        // Creating a linked list with a cycle
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a cycle (loop starts at node 3)
        head.next.next.next.next.next = head.next.next;

        // Before removing cycle
        System.out.println("Before loop removal (cycle exists):");
        printLL(head);

        // Removing the cycle
        list.remove(head);

        // After removing cycle
        System.out.println("\nAfter loop removal:");
        printLL(head);
    }
}
