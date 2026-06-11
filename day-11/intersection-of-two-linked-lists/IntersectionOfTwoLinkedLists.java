public class IntersectionOfTwoLinkedLists {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node intersection(Node headA,
                             Node headB){

        Node a = headA;
        Node b = headB;

        while(a != b){

            a = (a == null)
                    ? headB
                    : a.next;

            b = (b == null)
                    ? headA
                    : b.next;
        }

        return a;
    }

    public static void main(String[] args){

        System.out.println(
            "Striver Optimal: Two Pointer Switching"
        );
    }
}