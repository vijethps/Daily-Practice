class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        for(int i=1;i<s.length();i++){
            String ans = "";
              ans+=s.substring(i,s.length());
              ans+=s.substring(0,i);
             
             if(ans.equals(goal)){
               return true;
           }
              
        }
        return false;
    }
}