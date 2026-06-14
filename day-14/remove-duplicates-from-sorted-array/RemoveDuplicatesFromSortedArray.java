import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(
            int[] nums){

        int i = 0;

        for(int j=1;
            j<nums.length;
            j++){

            if(nums[i] != nums[j]){

                i++;

                nums[i] = nums[j];
            }
        }

        return i+1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int k =
            removeDuplicates(nums);

        System.out.println(
            "Unique Count = " + k
        );

        sc.close();
    }
}