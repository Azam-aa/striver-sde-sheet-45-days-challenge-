import java.util.*;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit,
                        prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int ans = maxProfit(prices);

        System.out.println("Maximum Profit: " + ans);

        sc.close();
    }
}
