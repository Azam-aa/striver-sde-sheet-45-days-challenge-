import java.util.*;

public class MaximumSumCombination {

    public static void main(String[] args){

        int[] A =
            {4,2,5,1};

        int[] B =
            {8,0,3,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int n = A.length;

        System.out.println(
            A[n-1] + B[n-1]
        );
    }
}