import java.util.*;

public class CountSubarraysWithGivenXORK {

    public static int subarraysXor(
            int[] arr,
            int k){

        HashMap<Integer,Integer> map =
                new HashMap<>();

        int xr = 0;
        int count = 0;

        map.put(0,1);

        for(int num : arr){

            xr ^= num;

            int x = xr ^ k;

            if(map.containsKey(x)){
                count += map.get(x);
            }

            map.put(
                    xr,
                    map.getOrDefault(xr,0)+1
            );
        }

        return count;
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
                subarraysXor(arr,k)
        );

        sc.close();
    }
}