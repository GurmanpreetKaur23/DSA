// import Recursive.Node;

// package Iterative;
class Node {
    int val ;
    Node next ;
    Node(int val) {
        this.val = val ;
    }
}

public class ReverseALinkedListiterative{
    public Node reverse(Node head) {
        Node prev = null ;
        Node curr = head ;
        Node next = null ;

        while(curr!=null) {
            // agla node save krdo in next node
            next = curr.next ;

            // link puthe krdo
            curr.next = prev ;

            // prev and curr ik ik step agge krdo
            prev = curr ;
            curr = next ;
        }
        return prev ;
        }

        public void printLL(Node head) {
            while(head!=null) {
                System.out.print(head.val + " -> ");
                head = head.next ;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            ReverseALinkedListiterative list = new ReverseALinkedListiterative() ;
            Node head = new Node(1) ;
            head.next = new Node(2) ;
            head.next.next = new Node(3) ;
            head.next.next.next = new Node(4) ;

            System.out.println("Original List : ");
            list.printLL(head) ;
            
            head = list.reverse(head) ;
            System.out.println("Reversed List : ");
            list.printLL(head) ;

        }

}