class Solution {
    public boolean canAliceWin(int[] nums) {
        int oneDigit = 0;
        int twoDigit = 0;
        for (int num : nums) {
            if (num < 10) {
                oneDigit += num;
            } else {
                twoDigit += num;
            }
        }
        return oneDigit != twoDigit;
    }
}