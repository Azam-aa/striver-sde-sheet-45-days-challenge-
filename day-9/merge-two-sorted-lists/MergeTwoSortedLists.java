public class MergeTwoSortedLists {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node merge(Node list1,
                      Node list2){

        Node dummy =
                new Node(-1);

        Node temp = dummy;

        while(list1 != null &&
              list2 != null){

            if(list1.data <= list2.data){

                temp.next = list1;
                list1 = list1.next;

            }else{

                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if(list1 != null)
            temp.next = list1;

        if(list2 != null)
            temp.next = list2;

        return dummy.next;
    }

    static void print(Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node ans = merge(l1,l2);

        print(ans);
    }
}