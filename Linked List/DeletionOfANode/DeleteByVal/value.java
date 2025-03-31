// package DSA.Linked List.DeletionOfANode;
class Node  {
    int val ;
    Node next ;

    Node (int val) {
        this.val = val ;
        this.next = null ;
    }
}

public class value {
    public static Node deletebyval(Node head , int x ){
        if(head.val==x) {
            head = head.next ;
            return head ;
        }

        Node temp = head ;
        Node prev = null ;

        while(temp!=null && temp.val!=x) {
            prev = temp ;
            temp = temp.next ;
        }
        prev.next = temp.next ;
        return head ;
    }    
    public void printLL(Node head) {
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next ;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        value list = new value() ;
        Node head = new Node(1) ;
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;

        System.out.println("Original List : ");
        list.printLL(head) ;
        
        head = list.deletebyval(head, 2); 

        System.out.println("Updated List : ");
        list.printLL(head) ;

    }
}
