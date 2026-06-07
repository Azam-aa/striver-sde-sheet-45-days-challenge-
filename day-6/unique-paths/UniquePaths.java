import java.util.*;

public class UniquePaths {

    public static int uniquePaths(int m, int n){

        int N = m + n - 2;
        int r = m - 1;

        double ans = 1;

        for(int i=1;i<=r;i++){
            ans = ans * (N-r+i) / i;
        }

        return (int)ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int m = sc.nextInt();

        System.out.print("Cols: ");
        int n = sc.nextInt();

        System.out.println(
            "Unique Paths: " +
            uniquePaths(m,n)
        );

        sc.close();
    }
}