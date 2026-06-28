import java.util.*;

public class MaximumOfMinimums {

    static int[] maxOfMin(int[] arr) {

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Previous Smaller
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty()
                    && arr[stack.peek()] >= arr[i]) {

                stack.pop();
            }

            left[i] = stack.isEmpty()
                    ? -1
                    : stack.peek();

            stack.push(i);
        }

        stack.clear();

        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty()
                    && arr[stack.peek()] >= arr[i]) {

                stack.pop();
            }

            right[i] = stack.isEmpty()
                    ? n
                    : stack.peek();

            stack.push(i);
        }

        int[] ans = new int[n + 1];

        Arrays.fill(ans, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {

            int len = right[i] - left[i] - 1;

            ans[len] = Math.max(
                    ans[len],
                    arr[i]
            );
        }

        for (int i = n - 1; i >= 1; i--) {

            ans[i] = Math.max(
                    ans[i],
                    ans[i + 1]
            );
        }

        return Arrays.copyOfRange(
                ans,
                1,
                n + 1
        );
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,50,10,70,30};

        System.out.println(
                Arrays.toString(
                        maxOfMin(arr)
                )
        );
    }
}