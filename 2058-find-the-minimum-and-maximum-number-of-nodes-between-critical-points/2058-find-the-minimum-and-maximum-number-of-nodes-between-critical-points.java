/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans[] = new int[2];
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if((list.get(i-1)>list.get(i)) && (list.get(i+1)>list.get(i))){
                l.add(i+1);
            }
            if((list.get(i-1)<list.get(i)) && (list.get(i+1)<list.get(i))){
                l.add(i+1);
            }
        }
        int size = l.size();
        if(l.size()<=1){
            return new int[]{-1,-1};
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size-1;i++){
            min = Math.min(l.get(i+1)-l.get(i),min);
        }
        max = l.get(size-1)-l.get(0);
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}