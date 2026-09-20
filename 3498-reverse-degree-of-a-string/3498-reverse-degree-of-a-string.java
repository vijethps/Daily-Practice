class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        char ch[] = s.toCharArray();
        int k = 1;
        for(int i=0;i<ch.length;i++){
            int a = 26-(ch[i]-'a');
            ans+=a*k;
            k++;
        }
        return ans;
    }
}