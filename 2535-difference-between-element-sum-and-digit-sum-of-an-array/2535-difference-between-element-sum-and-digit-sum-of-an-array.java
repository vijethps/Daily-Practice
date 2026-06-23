class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        String a = "";
        for(int i=0;i<nums.length;i++){
              a+=nums[i];
        }
        int rev = 0;
        for(int i=0;i<a.length();i++){
            int dig = a.charAt(i)-'0';
            rev+=dig;
        }
        return sum-rev;
    }
}