

import java.util.*;

public class LFUCache {

    class Node {
        int key, value, freq;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DoublyLinkedList {
        Node head, tail;
        int size;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void addFirst(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if (size == 0)
                return null;
            Node node = tail.prev;
            remove(node);
            return node;
        }
    }

    private final int capacity;
    private int minFreq;
    private final Map<Integer, Node> keyMap;
    private final Map<Integer, DoublyLinkedList> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyMap.containsKey(key))
            return -1;

        Node node = keyMap.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0)
            return;

        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            updateFrequency(node);
            return;
        }

        if (keyMap.size() == capacity) {
            DoublyLinkedList list = freqMap.get(minFreq);
            Node removed = list.removeLast();
            keyMap.remove(removed.key);
        }

        Node node = new Node(key, value);
        keyMap.put(key, node);

        DoublyLinkedList list = freqMap.getOrDefault(1, new DoublyLinkedList());
        list.addFirst(node);
        freqMap.put(1, list);

        minFreq = 1;
    }

    private void updateFrequency(Node node) {
        int freq = node.freq;

        DoublyLinkedList list = freqMap.get(freq);
        list.remove(node);

        if (freq == minFreq && list.size == 0)
            minFreq++;

        node.freq++;

        DoublyLinkedList newList = freqMap.getOrDefault(node.freq, new DoublyLinkedList());
        newList.addFirst(node);
        freqMap.put(node.freq, newList);
    }

    public static void main(String[] args) {
        LFUCache cache = new LFUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1)); // 1

        cache.put(3, 3);

        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 3

        cache.put(4, 4);

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}