class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i=0;i<words.length;i++){
            Set<Character> set = new HashSet<>();
            for(char ch : words[i].toCharArray()){
                set.add(ch);
            }
            for(int j=i+1;j<words.length;j++){
                boolean check = true;
                for(char ch : words[j].toCharArray()){
                      if(set.contains(ch)){
                        check = false ;
                        break;
                      }
                }
                if(check){
                    int ans = words[i].length()*words[j].length();
                    max = Math.max(max,ans);
                }
            }

        }  
        return max;
    }
}