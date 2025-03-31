// package DSA.Linked List.DeletionOfANode;

class Node {
    int val ;
    Node next ;

    Node(int val) {
        this.val = val; 
        // this.next = null ;
    }
}

public class pos {
    public static Node deletebypos(Node head , int pos) {
        if(head==null) return head ;
        if(pos<1) System.out.println("invalid position");

        // deletion at starting
        if(pos==1) {
            return head.next ;
        }

        Node temp = head ;
        Node prev = null ;

        for(int i=1 ; temp!=null && i<pos ; i++) {
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
        pos list = new pos() ;
        Node head = new Node(1) ;
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;

        System.out.println("Original List : ");
        list.printLL(head) ;
        
        head = list.deletebypos(head, 2); 

        System.out.println("Updated List : ");
        list.printLL(head) ;

        head = list.deletebypos(head, 1); 

        System.out.println("Updated List : ");
        list.printLL(head) ;
    }
}
