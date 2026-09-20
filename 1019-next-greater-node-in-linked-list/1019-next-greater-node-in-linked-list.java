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
    public int[] nextLargerNodes(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        int count = 0;
        Stack<Integer> st = new Stack<>();
        while(temp != null){
           temp = temp.next;
           count++;
        }
        int arr[] = new int[count];
        temp = head;
        // st.push(temp.val);
        int i = count-1;;
        // temp = temp.next;
        while(temp != null){
             while (!st.isEmpty() && st.peek() <= temp.val) {
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = 0;
            }
            else{
                arr[i] = st.peek();
            }
            st.push(temp.val);
            temp = temp.next;
            i--;
        }
        return arr;
    }
    public static ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}