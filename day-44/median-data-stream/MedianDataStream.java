import java.util.*;

public class MedianDataStream {

    static class MedianFinder {

        PriorityQueue<Integer> maxHeap;
        PriorityQueue<Integer> minHeap;

        MedianFinder() {

            maxHeap = new PriorityQueue<>((a, b) -> b - a);
            minHeap = new PriorityQueue<>();
        }

        void addNum(int num) {

            maxHeap.offer(num);

            minHeap.offer(maxHeap.poll());

            if (maxHeap.size() < minHeap.size())
                maxHeap.offer(minHeap.poll());
        }

        double findMedian() {

            if (maxHeap.size() > minHeap.size())
                return maxHeap.peek();

            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        mf.addNum(2);

        System.out.println(mf.findMedian());

        mf.addNum(3);

        System.out.println(mf.findMedian());
    }
}