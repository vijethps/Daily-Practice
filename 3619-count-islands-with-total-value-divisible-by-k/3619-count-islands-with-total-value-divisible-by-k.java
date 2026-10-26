class Solution {
    public int countIslands(int[][] grid, int k) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int visited[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] != 0 && visited[i][j]==0){
                    long sum = dfs(grid,visited,i,j);
                if(sum %k==0){
                    count++;
                }
                }
            }
        }
        return count;

    }
    public static long dfs(int [][] grid,int visited[][],int i,int j){
        if(i<0 || j< 0 || i>=grid.length ||j>=grid[0].length || grid[i][j]==0 || visited[i][j]==1){
            return 0;
        }
        visited[i][j] = 1;
        long sum = grid[i][j];
        sum+=dfs(grid,visited,i+1,j);
        sum+=dfs(grid,visited,i-1,j);
        sum+=dfs(grid,visited,i,j+1);
        sum+=dfs(grid,visited,i,j-1);
        return sum;
    }
}