class Node {
    int val ;
    Node next ;

    Node(int val) {
        this.val = val ;
    }
}

public class middle {
    public static Node mid(Node head) {
        Node slow = head ;
        Node fast = head ;
        if(head == null) {
            return head ;
        }

        while(fast != null && fast.next !=null ) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
        
    }

    public void printLL(Node head) {
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next ;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        middle list = new middle() ;
        Node head = new Node(1);
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;

        
        
        System.out.println("Middle of Linked List : "+list.mid(head).val);
    }
}
