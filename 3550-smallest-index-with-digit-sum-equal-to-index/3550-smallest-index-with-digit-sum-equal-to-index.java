class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(rev(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
    public static int rev(int num){
        int rev = 0;
        while(num > 0){
            int d = num%10;
            rev+=d;
            num=num/10;
        }
        return rev;
    }
}