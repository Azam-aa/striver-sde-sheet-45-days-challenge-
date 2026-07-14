import java.util.*;

public class KthLargestStream {

    static class KthLargest {

        PriorityQueue<Integer> minHeap;
        int k;

        KthLargest(int k, int[] nums) {

            this.k = k;
            minHeap = new PriorityQueue<>();

            for (int num : nums)
                add(num);
        }

        int add(int val) {

            minHeap.offer(val);

            if (minHeap.size() > k)
                minHeap.poll();

            return minHeap.peek();
        }
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 8, 2};

        KthLargest kth = new KthLargest(3, nums);

        System.out.println(kth.add(3));
        System.out.println(kth.add(5));
        System.out.println(kth.add(10));
        System.out.println(kth.add(9));
        System.out.println(kth.add(4));
    }
}