import java.util.*;

public class SubsetsII {

    static void solve(
            int index,
            int[] nums,
            List<Integer> ds,
            List<List<Integer>> ans){

        ans.add(
            new ArrayList<>(ds)
        );

        for(int i=index;
            i<nums.length;
            i++){

            if(i > index &&
               nums[i] ==
               nums[i-1])
                continue;

            ds.add(nums[i]);

            solve(
                i+1,
                nums,
                ds,
                ans
            );

            ds.remove(
                ds.size()-1
            );
        }
    }

    public static void main(String[] args){

        int[] nums =
            {1,2,2};

        List<List<Integer>> ans =
            new ArrayList<>();

        solve(
            0,
            nums,
            new ArrayList<>(),
            ans
        );

        System.out.println(ans);
    }
}