import java.util.*;

public class LargestSubarrayWithSumK {

    public static int longestSubarray(
            int[] arr,
            int k) {

        HashMap<Integer,Integer> map =
                new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<arr.length;i++){

            sum += arr[i];

            if(sum == k){
                maxLen = i + 1;
            }

            int rem = sum - k;

            if(map.containsKey(rem)){
                maxLen = Math.max(
                        maxLen,
                        i - map.get(rem)
                );
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(
                longestSubarray(arr,k)
        );

        sc.close();
    }
}