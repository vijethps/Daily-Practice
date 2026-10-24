class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m= board[0].length;
        int temp[][] = new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int [] get = check(board,n,m,i,j);
                int zero = get[0];
                int one = get[1];
                if(board[i][j]==1 && one<2){
                    temp[i][j] = 0;
                }
                else if(board[i][j]==1 &&(one==2 || one==3)){
                    temp[i][j]=1;
                }
                else if(board[i][j]==1 && one>3){
                    temp[i][j] = 0;
                }
                else if(board[i][j]==0 && one==3){
                    temp[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]  = temp[i][j];
            }
        }
    }
    public static int[] check(int [][] board,int n,int m,int a,int b){
        int[] r = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] c = {-1,  0,  1, -1, 1, -1, 0, 1};
        int zeros = 0;
        int ones = 0;
        for(int i=0;i<8;i++){
            int nr = a+r[i];
            int nc = b+c[i];
            if(nr>=0 && nc>=0 && nr<n && nc<m){
                if(board[nr][nc]==1){
                    ones++;
                }
                else{
                    zeros++;
                }
            }
        }
        return new int[]{zeros,ones};
    }
}
// class Solution {
//     public void gameOfLife(int[][] board) {
//         int n = board.length;
//         int m = board[0].length;

//         int[][] temp = new int[n][m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 int live = 0;

//                 for (int x = -1; x <= 1; x++) {
//                     for (int y = -1; y <= 1; y++) {
//                         if (x == 0 && y == 0) {
//                             continue;
//                         }

//                         int r = i + x;
//                         int c = j + y;

//                         if (r >= 0 && r < n &&
//                             c >= 0 && c < m &&
//                             board[r][c] == 1) {
//                             live++;
//                         }
//                     }
//                 }

//                 if (board[i][j] == 1) {
//                     if (live < 2 || live > 3) {
//                         temp[i][j] = 0;
//                     } else {
//                         temp[i][j] = 1;
//                     }
//                 } else {
//                     if (live == 3) {
//                         temp[i][j] = 1;
//                     } else {
//                         temp[i][j] = 0;
//                     }
//                 }
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 board[i][j] = temp[i][j];
//             }
//         }
//     }
// }