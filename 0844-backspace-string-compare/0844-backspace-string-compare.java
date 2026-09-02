class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = operation(s);
        String s2 = operation(t); 
        if(s1.equals(s2)){
            return true;
        }  
        return false;
    }
    public static String  operation(String s){
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c >= 'a' && c<='z'){
                stack.push(c);
            }
            if(c=='#' && !stack.isEmpty()){
                stack.pop();
            }
        }
        String ans = "";
        int m = stack.size();
        for(int i=0;i<m;i++){
            ans+=stack.pop();
        }
        return ans;
    }
}