class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        char ch [] = s.toCharArray();
        int ans = 0;
        int a =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
            int d = ch[i]-'0';
            a=a*10+d;
            ans+=d;
            }
        }
        return (long)a*ans;
    }
}