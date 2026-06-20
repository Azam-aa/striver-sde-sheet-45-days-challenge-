public class MatrixMedian {

    static int countSmallerEqual(
            int[] row,
            int x) {

        int low = 0;
        int high = row.length - 1;

        while(low <= high) {

            int mid =
                low + (high - low) / 2;

            if(row[mid] <= x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

    static int median(int[][] matrix,
                      int r,
                      int c) {

        int low = 1;
        int high = 2000;

        while(low <= high) {

            int mid =
                low + (high - low) / 2;

            int count = 0;

            for(int i = 0; i < r; i++) {

                count +=
                    countSmallerEqual(
                        matrix[i],
                        mid
                    );
            }

            if(count <=
               (r * c) / 2)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,3,5},
            {2,6,9},
            {3,6,9}
        };

        System.out.println(
            median(matrix,3,3)
        );
    }
}