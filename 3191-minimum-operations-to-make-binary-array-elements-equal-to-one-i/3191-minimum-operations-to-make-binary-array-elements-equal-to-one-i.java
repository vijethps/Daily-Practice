class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<=n-3;i++){
            if(nums[i]==1){
                continue;
            }
            else{
            for(int j=i;j<i+3;j++){
                if(nums[j]==0){
                    nums[j] = 1;
                }     
                else if(nums[j]==1){
                    nums[j] = 0;
                }
            }
            count++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                return -1;
            }
        }
        return count;
    }
}