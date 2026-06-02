import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int index = -1;
        int n = nums.length;

        // Step 1: Find breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                break;
            }
        }

        // Step 4: Reverse right half
        reverse(nums, index + 1, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next Permutation:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

