class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Deque<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        for(int i=n-1;i>=0;i--){
            if(q.isEmpty()){
                q.addFirst(deck[i]);
            }
            else if(q.size()==1){
                q.addFirst(deck[i]);
            }
            else{
                int m = q.removeLast();
                q.addFirst(m);
                q.addFirst(deck[i]);
            }
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = q.removeFirst();
        }
        return ans;
        
    }
}