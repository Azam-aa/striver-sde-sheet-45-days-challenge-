import java.util.*;

public class DistinctNumbersSubarray {

    static List<Integer> countDistinct(int[] arr, int k) {

        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        ans.add(map.size());

        for (int i = k; i < arr.length; i++) {

            int left = arr[i - k];

            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0)
                map.remove(left);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            ans.add(map.size());
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 2, 3};

        int k = 4;

        System.out.println(countDistinct(arr, k));
    }
}