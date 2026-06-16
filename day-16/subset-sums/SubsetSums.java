import java.util.*;

public class SubsetSums {

    static void solve(
            int index,
            int sum,
            int[] arr,
            ArrayList<Integer> ans){

        if(index == arr.length){

            ans.add(sum);
            return;
        }

        solve(
            index + 1,
            sum + arr[index],
            arr,
            ans
        );

        solve(
            index + 1,
            sum,
            arr,
            ans
        );
    }

    public static void main(String[] args){

        int[] arr =
            {1,2,3};

        ArrayList<Integer> ans =
            new ArrayList<>();

        solve(
            0,
            0,
            arr,
            ans
        );

        Collections.sort(ans);

        System.out.println(ans);
    }
}