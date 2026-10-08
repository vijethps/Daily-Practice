class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String ans="";
        char ch[] = s.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i++){
            if(ch[i]=='('){
            if(!stack.isEmpty()){
                ans+=ch[i];
            }
            stack.push(ch[i]);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    ans+=ch[i];
                }
            }
        }
        return ans;
    }
}