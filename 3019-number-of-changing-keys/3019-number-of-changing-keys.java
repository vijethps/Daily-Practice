class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        char ch[] = s.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length-1;i++){
             if(ch[i] != ch[i+1]){
                count++;
             }
        }
        return count;
    }
}