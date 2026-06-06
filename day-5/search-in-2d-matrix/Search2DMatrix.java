import java.util.*;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target){

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1;

        while(low <= high){

            int mid = low + (high - low)/2;

            int row = mid / m;
            int col = mid % m;

            if(matrix[row][col] == target)
                return true;

            if(matrix[row][col] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int n = sc.nextInt();

        System.out.print("Cols: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix:");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.print("Target: ");
        int target = sc.nextInt();

        System.out.println(searchMatrix(matrix,target));

        sc.close();
    }
}