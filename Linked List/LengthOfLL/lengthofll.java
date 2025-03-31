// package DSA.Linked List.SearchANode;
class Node {
    int val ;
    Node next ;

    Node(int val) {
        this.val = val ;
    }
}

public class lengthofll {
    public static int length(Node head) {
        int count = 0 ;
        Node temp = head ;

        while(temp!=null) {
            count++ ;
            temp = temp.next ;
        }
        return count ;
    }

    public void printLL(Node head) {
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next ;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        lengthofll list = new lengthofll() ;
        Node head = new Node(1);
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;

        System.out.println("Original List : ");
        list.printLL(head) ;
        
        System.out.println("Length of Linked List : "+list.length(head));
    }
}
