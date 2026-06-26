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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        if(head == null){
            return null;
        }
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count==n){
            return head.next;
        }
        int p=0;
        temp = head;
        while(p<count-n-1){
            temp=temp.next;
            p++;
        }
        temp.next = temp.next.next;
        return head;
    }
}