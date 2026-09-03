class Solution {
    public int minAddToMakeValid(String s) {
        int count1=0;
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    count1++;
                }
                
            }
        }
        return count1+stack.size();
    }
}