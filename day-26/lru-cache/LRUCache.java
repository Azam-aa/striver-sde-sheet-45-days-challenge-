import java.util.*;

public class LRUCache {

    private final int capacity;

    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {

        this.capacity = capacity;

        cache = new LinkedHashMap<>(
                capacity,
                0.75f,
                true
        ) {

            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<Integer, Integer> eldest) {

                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {

        return cache.getOrDefault(
                key,
                -1
        );
    }

    public void put(int key, int value) {

        cache.put(
                key,
                value
        );
    }

    public static void main(String[] args) {

        LRUCache cache =
                new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(
                cache.get(1)
        );

        cache.put(3, 3);

        System.out.println(
                cache.get(2)
        );

        cache.put(4, 4);

        System.out.println(
                cache.get(1)
        );

        System.out.println(
                cache.get(3)
        );

        System.out.println(
                cache.get(4)
        );
    }
}