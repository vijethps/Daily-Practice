class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && c==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        char ch[] = ans.toCharArray();
        String a = "";
        for(int i=ch.length-1;i>=0;i--){
            a+=ch[i];
        }
        return a;
    }
}