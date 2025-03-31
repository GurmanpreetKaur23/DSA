// package DSA.Linked List.InsertionOfANode;

class Node {
    int val ;
    Node next ;

    Node(int val) {
        this.val = val ;
    }
}

public class start {
    public static Node insertAtBeginning(Node head , int val) {
        Node newNode = new Node(val) ;
        newNode.next = head ;
        head = newNode ;
        return newNode ;
    }
    public void printLL(Node head) {
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next ;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        start list = new start() ;
        Node head = new Node(1) ;
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;

        System.out.println("Original List : ");
        list.printLL(head) ;
        
        head = list.insertAtBeginning(head, 5); 

        System.out.println("Updated List : ");
        list.printLL(head) ;

    }
}
