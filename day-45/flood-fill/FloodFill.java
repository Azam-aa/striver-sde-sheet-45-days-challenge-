import java.util.Arrays;

public class FloodFill {

    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    static int[][] floodFill(int[][] image,
                             int sr,
                             int sc,
                             int color) {

        int original = image[sr][sc];

        if (original == color)
            return image;

        dfs(image, sr, sc, original, color);

        return image;
    }

    static void dfs(int[][] image,
                    int row,
                    int col,
                    int original,
                    int color) {

        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length ||
            image[row][col] != original)
            return;

        image[row][col] = color;

        for (int i = 0; i < 4; i++)
            dfs(image,
                row + dr[i],
                col + dc[i],
                original,
                color);
    }

    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int[][] ans = floodFill(image, 1, 1, 2);

        for (int[] row : ans)
            System.out.println(Arrays.toString(row));
    }
}