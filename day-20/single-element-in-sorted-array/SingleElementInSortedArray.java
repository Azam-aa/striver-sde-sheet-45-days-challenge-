public class SingleElementInSortedArray {

    static int singleElement(int[] nums) {

        int low = 0;
        int high = nums.length - 2;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {

        int[] nums =
            {1,1,2,2,3,4,4,5,5};

        System.out.println(singleElement(nums));
    }
}