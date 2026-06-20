public class NthRoot {

    static int power(int mid, int n, int m) {

        long ans = 1;

        for(int i = 1; i <= n; i++) {

            ans *= mid;

            if(ans > m) return 2;
        }

        if(ans == m) return 1;

        return 0;
    }

    static int nthRoot(int n, int m) {

        int low = 1;
        int high = m;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int val = power(mid, n, m);

            if(val == 1) return mid;

            else if(val == 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 27;

        System.out.println(nthRoot(n, m));
    }
}