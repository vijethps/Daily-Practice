class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int [][] ch = new int[numRows][s.length()];
        char[] str = s.toCharArray();
        int k =0,i=0,j=0,l=s.length();
        boolean flag = false;
        while(k<l){
            if(flag){
                ch[i][j] = str[k++];
                i-=1;
                j++;
                if(i==-1){
                    i+=2;
                    flag = false;
                }
            }
            else{
                ch[i][j] = str[k++];
                i+=1;
                if(i == numRows){
                    flag = true;
                    i-=2;
                    j++;
                }
            }
        }
        String si = "";
        for(int t=0;t<numRows;t++){
            for(k=0;k<l;k++){
                if(ch[t][k]!=0){
                    char c=(char)ch[t][k];
                    si+=c;
                }
            }
        }
        return si;
    }
}