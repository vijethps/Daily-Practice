class Solution {
    public String[] createGrid(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0;i<n;i++){
            arr[0][i] = 1;
        }
        for(int i=0;i<m;i++){
            arr[i][n-1]=1;
        }
        String [] ans = new String[m];
        for(int i =0;i<m;i++){
            String temp = "";
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    temp+='#';
                }
                else{
                    temp+='.';
                }
            }
            ans[i]= temp;
        }
        return ans;
    }
}