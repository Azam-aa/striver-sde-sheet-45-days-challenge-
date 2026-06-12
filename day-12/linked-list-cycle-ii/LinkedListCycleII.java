public class LinkedListCycleII {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static Node detectCycle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null &&
              fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args){

        System.out.println(
            "Pattern: Floyd Cycle Detection"
        );
    }
}