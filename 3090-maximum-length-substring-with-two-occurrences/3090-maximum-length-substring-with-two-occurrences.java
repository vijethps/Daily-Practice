class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            int l = 0;
            String st= "";
            int fre[] = new int[26];
            for(int j=i;j<n;j++){
               char a = s.charAt(j);
               fre[a-'a']++; 
               if(fre[a-'a']>2){
                break;
               }
               l = j-i+1;         
            }
            max = Math.max(max,l);
        }
        return max;
    }
}