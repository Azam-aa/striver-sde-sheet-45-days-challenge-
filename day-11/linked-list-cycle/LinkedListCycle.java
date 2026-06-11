public class LinkedListCycle {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static boolean hasCycle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null &&
              fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        System.out.println(
            "Striver Optimal: Floyd Cycle Detection"
        );
    }
}