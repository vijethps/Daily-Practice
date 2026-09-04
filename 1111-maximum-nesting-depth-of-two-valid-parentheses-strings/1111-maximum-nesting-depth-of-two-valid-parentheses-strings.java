class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int dep = 0;
        int n = seq.length();
        int ans []= new int[n];
        for(int i=0;i<n;i++){
            char c = seq.charAt(i);
            if(c=='('){
                dep++;
                ans[i] = dep%2;
            }
            else{
                ans[i] = dep%2;
                dep--;
            }
        }
        return ans;
        
    }
}