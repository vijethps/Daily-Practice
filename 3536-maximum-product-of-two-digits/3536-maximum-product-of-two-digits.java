class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        char ch [] =  s.toCharArray();
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<ch.length;i++){
            int val = ch[i]-'0';
            if(val>=max){
                smax = max;
                max = val;
            }
            else if(val>smax && val != max){
                smax = val;
            }
        }
        return max*smax;

    }
}