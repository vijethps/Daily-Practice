class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int j=0;j<n;j++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<=j;i++){
                max = Math.max(max,nums[i]);
            }
            for(int i=j;i<n;i++){
                min  = Math.min(min,nums[i]);
            }
            int ans = max-min;
            if(ans<=k){
                return j;
            }
        }
        return -1;
    }
}