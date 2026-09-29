class Solution {
    public String clearDigits(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(c>='a' && c<='z'){
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        char ch[] = ans.toCharArray();
        String a = "";
        for(int i=ch.length-1;i>=0;i--){
              a+=ch[i];
        }
        return a;
    }
}