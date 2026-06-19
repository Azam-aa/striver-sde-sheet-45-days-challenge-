public class MColoringProblem {

    static boolean isSafe(
            int node,
            int[][] graph,
            int[] color,
            int n,
            int col){

        for(int k=0;k<n;k++){

            if(graph[node][k]==1
               && color[k]==col){

                return false;
            }
        }

        return true;
    }

    static boolean solve(
            int node,
            int[][] graph,
            int[] color,
            int m,
            int n){

        if(node==n)
            return true;

        for(int col=1;
            col<=m;
            col++){

            if(isSafe(
                    node,
                    graph,
                    color,
                    n,
                    col)){

                color[node]=col;

                if(solve(
                        node+1,
                        graph,
                        color,
                        m,
                        n))
                    return true;

                color[node]=0;
            }
        }

        return false;
    }

    public static void main(String[] args){

        System.out.println(
            "Graph Coloring Using Backtracking"
        );
    }
}