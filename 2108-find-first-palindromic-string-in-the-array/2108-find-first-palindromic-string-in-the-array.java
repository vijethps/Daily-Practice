class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i=0;i<words.length;i++){
            char arr []= words[i].toCharArray();
            String rev = "";
            for(int j=arr.length-1;j>=0;j--){
                 rev += arr[j]; 
            }
            if(words[i].equals(rev)){
                ans = words[i];
                break;
            }
        }
        return ans;
    }
}