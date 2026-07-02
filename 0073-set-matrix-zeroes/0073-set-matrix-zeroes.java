class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<int []> q = new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int cur[] = q.poll();
            int r = cur[0];
            int c = cur[1];
            for(int j=0;j<m;j++){
                matrix[r][j] = 0;
            }
            for(int j=0;j<n;j++){
                matrix[j][c] = 0;
            }
        }
    }
}