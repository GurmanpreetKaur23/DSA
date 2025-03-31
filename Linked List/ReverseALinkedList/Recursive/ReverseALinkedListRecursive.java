// package Recursive;
// import Iterative.Node;

class Node {
    int val ; 
    Node next ;
    Node (int val) {
        this.val = val ;
    }  
}

public class ReverseALinkedListRecursive {
    public Node reverse(Node head) {

        if(head==null || head.next==null) return head ;

        Node newHead = reverse(head.next) ;
        head.next.next = head ;
        head.next = null ; // poorana link todn vste
        return newHead ;
    }
    public void printLL(Node head) {
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next ;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseALinkedListRecursive list = new ReverseALinkedListRecursive() ;
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
