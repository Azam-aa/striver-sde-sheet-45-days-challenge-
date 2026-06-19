import java.util.*;

public class RatInMaze {

    static void solve(
            int i,
            int j,
            int[][] maze,
            int n,
            String path,
            ArrayList<String> ans,
            int[][] vis){

        if(i==n-1 &&
           j==n-1){

            ans.add(path);
            return;
        }

        int[] di =
            {1,0,0,-1};

        int[] dj =
            {0,-1,1,0};

        String dir =
            "DLRU";

        for(int ind=0;
            ind<4;
            ind++){

            int nexti =
                i+di[ind];

            int nextj =
                j+dj[ind];

            if(nexti>=0 &&
               nextj>=0 &&
               nexti<n &&
               nextj<n &&
               vis[nexti][nextj]==0 &&
               maze[nexti][nextj]==1){

                vis[i][j]=1;

                solve(
                    nexti,
                    nextj,
                    maze,
                    n,
                    path+dir.charAt(ind),
                    ans,
                    vis
                );

                vis[i][j]=0;
            }
        }
    }

    public static void main(String[] args){

        System.out.println(
            "Pattern: Maze Backtracking"
        );
    }
}