class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            char ch [] = s.toCharArray();
            for(int j=0;j<ch.length;j++){
                if(ch[j]==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}