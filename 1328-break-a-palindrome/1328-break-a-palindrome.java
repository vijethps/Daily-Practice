class Solution {
    public String breakPalindrome(String palindrome) {
        char ch[] = palindrome.toCharArray();
        int n =ch.length;
        for(int i=0;i<n/2;i++){
            if(ch[i] != 'a'){
                ch[i] = 'a';
                return new String(ch);
            }
        }
        if(n==1){
            return "";
        }
        else{
            ch[n-1] = 'b';
            return new String(ch);
        }
    }
}