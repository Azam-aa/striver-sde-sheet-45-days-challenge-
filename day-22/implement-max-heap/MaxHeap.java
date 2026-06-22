import java.util.*;

public class MaxHeap {

    ArrayList<Integer> heap = new ArrayList<>();

    void insert(int val){

        heap.add(val);

        int index = heap.size()-1;

        while(index > 0){

            int parent =
                (index-1)/2;

            if(heap.get(parent)
                < heap.get(index)){

                Collections.swap(
                    heap,
                    parent,
                    index
                );

                index = parent;

            }else{
                break;
            }
        }
    }

    public static void main(String[] args){

        MaxHeap h =
            new MaxHeap();

        h.insert(10);
        h.insert(50);
        h.insert(20);

        System.out.println(
            h.heap
        );
    }
}