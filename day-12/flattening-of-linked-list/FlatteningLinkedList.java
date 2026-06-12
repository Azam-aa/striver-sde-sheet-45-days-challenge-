public class FlatteningLinkedList {

    static class Node{
        int data;
        Node next;
        Node bottom;

        Node(int data){
            this.data = data;
        }
    }

    public static Node flatten(Node root){

        if(root == null ||
           root.next == null){
            return root;
        }

        root.next =
            flatten(root.next);

        return merge(
                root,
                root.next
        );
    }

    private static Node merge(
            Node a,
            Node b){

        Node dummy =
                new Node(-1);

        Node temp = dummy;

        while(a != null &&
              b != null){

            if(a.data < b.data){

                temp.bottom = a;
                temp = a;
                a = a.bottom;

            }else{

                temp.bottom = b;
                temp = b;
                b = b.bottom;
            }
        }

        if(a != null)
            temp.bottom = a;

        else
            temp.bottom = b;

        return dummy.bottom;
    }

    public static void main(String[] args){

        System.out.println(
            "Pattern: Merge Two Sorted Lists + Recursion"
        );
    }
}