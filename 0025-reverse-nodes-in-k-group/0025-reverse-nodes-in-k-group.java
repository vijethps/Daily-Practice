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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp1 = head;
        int count = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            count++;
        }
        temp1 = head;
        ListNode pre = null;
        ListNode after = null;
        while(count>=k){
            ListNode temp2 = temp1;
            for(int i=0;i<k;i++){
                temp2 = temp2.next;
            }
            ListNode reverse = rev(temp1,temp2);
            if(after==null){
                after = reverse;
            }
            else{
                pre.next = reverse;
            }
            pre = temp1;
            pre.next = temp2;
            temp1 = temp2;
            count = count-k;
        }
       return after;
    }
    public static ListNode rev(ListNode temp1,ListNode temp2){
        ListNode cur = temp1;
        ListNode pre = null;
        while(cur != temp2){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}