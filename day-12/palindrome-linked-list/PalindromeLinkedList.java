public class PalindromeLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean isPalindrome(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null &&
              fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;

        while(slow != null){

            Node next = slow.next;

            slow.next = prev;

            prev = slow;
            slow = next;
        }

        while(prev != null){

            if(head.data != prev.data){
                return false;
            }

            head = head.next;
            prev = prev.next;
        }

        return true;
    }

    public static void main(String[] args){

        System.out.println(
            "Pattern: Find Middle + Reverse"
        );
    }
}