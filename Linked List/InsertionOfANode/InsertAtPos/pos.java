// package DSA.Linked List.InsertionOfANode;
class Node {
    int val ;
    Node next ;

    Node(int val) {
        this.val = val ;
    }
}

public class pos {
    public static Node insertAtpos(Node head , int pos , int val) {
        Node newNode = new Node(val) ;
        
        if(pos<1) {
            System.out.println("invalid position");
        }

        if(pos==1) {
            // insert at beginning
            newNode.next = head ;
            head = newNode ;
            return newNode ;
        }

        Node temp = head;
        for(int i=1 ; temp!=null && i<pos-1 ; i++) {
            temp = temp.next ;
        }
        if(temp==null) System.out.println("Out Of Bounds");
        newNode.next = temp.next ;
        temp.next = newNode ;
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
        
        head = list.insertAtpos(head,2 , 5); 

        System.out.println("Updated List : ");
        list.printLL(head) ;

    }
}

