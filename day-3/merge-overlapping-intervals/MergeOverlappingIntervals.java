import java.util.*;

public class MergeOverlappingIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,
                (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {

            if (merged.isEmpty() ||
                merged.get(merged.size() - 1)[1] < interval[0]) {

                merged.add(interval);

            } else {

                merged.get(merged.size() - 1)[1] =
                        Math.max(
                                merged.get(merged.size() - 1)[1],
                                interval[1]
                        );
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter start and end:");

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] ans = merge(intervals);

        System.out.println("\nMerged Intervals:");

        for (int[] interval : ans) {
            System.out.println(
                    "[" + interval[0] + ", " + interval[1] + "]"
            );
        }

        sc.close();
    }
}

