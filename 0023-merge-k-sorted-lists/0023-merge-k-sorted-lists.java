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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer>list = new ArrayList<>();
        for(ListNode head:lists){
            while(head != null){
                list.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(list);
        ListNode d = new ListNode(0);
        ListNode temp = d;
        for(int x:list){
            temp.next = new ListNode(x);
            temp = temp.next;

        }
        return d.next;
    }
}