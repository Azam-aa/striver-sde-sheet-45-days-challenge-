import java.util.*;

public class MinimumPlatforms {

    public static int findPlatform(
            int[] arr,
            int[] dep,
            int n){

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1;
        int j = 0;

        int platforms = 1;
        int maxPlatforms = 1;

        while(i < n && j < n){

            if(arr[i] <= dep[j]){

                platforms++;

                i++;

            }else{

                platforms--;

                j++;
            }

            maxPlatforms =
                Math.max(
                    maxPlatforms,
                    platforms
                );
        }

        return maxPlatforms;
    }

    public static void main(String[] args){

        int[] arr =
            {900,940,950,1100,1500,1800};

        int[] dep =
            {910,1200,1120,1130,1900,2000};

        System.out.println(
            findPlatform(
                arr,
                dep,
                arr.length
            )
        );
    }
}