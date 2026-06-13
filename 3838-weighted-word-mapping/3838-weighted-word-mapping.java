class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            int mod = sum % 26;
            char ch = (char) ('a' + (25 - mod));
            ans.append(ch);
        }
        return ans.toString();
    }
}