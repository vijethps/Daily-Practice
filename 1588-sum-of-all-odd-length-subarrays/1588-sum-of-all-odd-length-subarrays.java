class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int k = 1;
        int n = arr.length;
        int sum = 0;
        while(k<=n){
            for(int i=0;i<=n-k;i++){
                for(int j=i;j<i+k;j++){
                    sum+=arr[j];
                }
            }
            k=k+2;
        }
        return sum;
    }
}