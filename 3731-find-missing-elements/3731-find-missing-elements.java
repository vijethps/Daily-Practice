class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}