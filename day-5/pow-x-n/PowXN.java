import java.util.*;

public class PowXN {

    public static double myPow(double x, int n){

        long N = n;

        if(N < 0){
            x = 1/x;
            N = -N;
        }

        double ans = 1;

        while(N > 0){

            if(N % 2 == 1){
                ans *= x;
            }

            x *= x;
            N /= 2;
        }

        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(myPow(x,n));

        sc.close();
    }
}