class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int a = 1;
        while(q.size()>1){
            if(a==k){
                q.poll();
                a = 1;
            }
            else{
                int d = q.poll();
                q.add(d);
                a++;
            }
        }
        return q.peek();
    }
}