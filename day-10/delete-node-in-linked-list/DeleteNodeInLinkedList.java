public class DeleteNodeInLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    static void deleteNode(Node node){

        node.data = node.next.data;

        node.next = node.next.next;
    }

    static void print(Node head){

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args){

        Node head=new Node(4);
        head.next=new Node(5);
        head.next.next=new Node(1);
        head.next.next.next=new Node(9);

        deleteNode(head.next);

        print(head);
    }
}