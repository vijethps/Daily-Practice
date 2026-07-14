class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{j, i};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}