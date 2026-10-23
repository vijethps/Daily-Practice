class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> after = new ArrayList<>();
        List<Integer> before = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                after.add(nums[i]);
            }
            else{
                before.add(nums[i]);
            }
        }
        int ans[] = new int[n];
        int a = 0;
        int b=0;
        for(int i=0;i<n;i++){
            if(i % 2==0){
                ans[i] = after.get(a);
                a++;
            }
            else{
                ans[i] = before.get(b);
                b++;
            }
        }
        return ans;
    }
}