class Solution {
    public boolean isValid(String s) {
       char ch[] = s.toCharArray();
       char check [] = new char[s.length()];
       int j=0;
       if(s.length()<2){
          return false;
       }
       for(int i=0;i<s.length();i++){
        if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
            check[j] = ch[i];
            j++;
        }
        else{
            if(j==0){
                return false;
            }
            char top = check[j-1];
            if(ch[i]==')' && top !='('){
                return false;
            }
            if(ch[i]=='}' && top != '{'){
                return false;
            }
            if(ch[i]==']' && top != '['){
                return false;
            }
            j--;
        }
        
    }
    return j==0 ;
    }
}