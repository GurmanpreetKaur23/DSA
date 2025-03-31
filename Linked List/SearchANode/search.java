// package DSA.Linked List.SearchANode;
class Node {
    int val ;
    Node next ;

    Node(int val) {
        this.val = val ;
    }
}

public class search {
    public static boolean searchNode(Node head , int x) {
        Node temp = head ;

        while(temp!=null) {
            if(temp.val==x) return true ;
            temp = temp.next ;
        }
        return false ;
    }

    public void printLL(Node head) {
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next ;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        search list = new search() ;
        Node head = new Node(1) ;
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;

        System.out.println("Original List : ");
        list.printLL(head) ;
        
        int target = 3;
        if (searchNode(head, target)) {
            System.out.println(target + " is present in the linked list.");
        } else {
            System.out.println(target + " is not present in the linked list.");
        }
    }
}
