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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        if(head==null || head.next == null){
            return head;
        }
        while(temp != null){
            temp=temp.next;
            count++;
        }
        k = k%count;
        if(k==0){
            return head;
        }
        count = count - k;
        temp = head;
        while(count != 1){
             temp = temp.next;
             count--;
        }
        ListNode dummy = temp.next;
        temp.next = null;
        temp = dummy;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return dummy;
    }
}