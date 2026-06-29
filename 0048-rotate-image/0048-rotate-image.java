class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] grid = new int[n][m];
        int a = 0;
        for(int i=0;i<n;i++){
            int b = 0;
            for(int j=m-1;j>=0;j--){
                grid[a][b] = matrix[j][i];
                b++;
            }
            a++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = grid[i][j];
            }
        }
        
    }
}