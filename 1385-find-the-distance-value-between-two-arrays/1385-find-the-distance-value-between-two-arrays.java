class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m = arr2.length;
        int count = 0;
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=0;j<m;j++){
                int sum = Math.abs(arr1[i]-arr2[j]);
                if(sum<=d){
                    check = false;
                }
            }
            if(check){
                count++;
            }
        }
        return count;
    }
}