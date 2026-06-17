class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for(int i=0;i<s.length;i++){
            int count=1;
            for(int j=0;j<s[i].length();j++){
               char c = s[i].charAt(j);
               if(c==' '){
                count++;
               }
            }
            max = Math.max(count,max);
        } 
        return max;
    }
}