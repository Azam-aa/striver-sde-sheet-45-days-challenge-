import java.util.*;

public class Permutations {

    static void solve(int index, int[] nums){

        if(index == nums.length){

            System.out.println(
                Arrays.toString(nums)
            );

            return;
        }

        for(int i=index;
            i<nums.length;
            i++){

            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            solve(index+1, nums);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args){

        int[] nums = {1,2,3};

        solve(0, nums);
    }
}