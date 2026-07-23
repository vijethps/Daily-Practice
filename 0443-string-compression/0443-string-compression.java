class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index = 0;
        while(i != chars.length){
            int count = 1;
             while(i+1<chars.length && chars[i]==chars[i+1] ){
                count++;
                i++;
             }
             chars[index++] = chars[i];
             if(count>1){
            String c = String.valueOf(count);
            char g[] = c.toCharArray();
            for(int j=0;j<g.length;j++){
                chars[index++] = g[j];
            }
             }
            i++;
        }
        return index;
        
    }
}