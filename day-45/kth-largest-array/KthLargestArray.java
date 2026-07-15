public class KthLargestArray {

    static int findKthLargest(int[] nums, int k) {

        int left = 0;
        int right = nums.length - 1;
        int target = nums.length - k;

        while (true) {

            int pivot = partition(nums, left, right);

            if (pivot == target)
                return nums[pivot];

            if (pivot < target)
                left = pivot + 1;
            else
                right = pivot - 1;
        }
    }

    static int partition(int[] nums, int left, int right) {

        int pivot = nums[right];
        int i = left;

        for (int j = left; j < right; j++) {

            if (nums[j] <= pivot) {

                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, right);

        return i;
    }

    static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};

        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }
}