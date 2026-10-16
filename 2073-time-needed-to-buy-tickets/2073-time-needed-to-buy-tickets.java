class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        int pointer =0;
        int n = tickets.length;
        while(tickets[k] !=0){
            if(pointer ==n){
                pointer =0;
            }
            if(tickets[pointer] !=0){
                tickets[pointer] -=1;
                count++;
            }
            pointer++;
        } 
        return count;

    }
}