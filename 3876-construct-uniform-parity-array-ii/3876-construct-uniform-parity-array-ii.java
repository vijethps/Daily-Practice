class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int odd = Integer.MAX_VALUE;
        for(int num : nums1){
            if(num %2==1){
                odd = Math.min(num,odd);
            }
        }
        if(odd == Integer.MAX_VALUE)return true;
        for(int num : nums1){
            if(num %2==0 && num<odd){
                return false;
            }
        }
        return true;
    }
}