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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
           ListNode temp = head;
           List<Integer> list = new ArrayList<>();
           if(head==null||head.next==null){
            return head;
           }
           while(temp.next != null){
               list.add(gcd(temp.val,temp.next.val));
               temp = temp.next;
           }
           temp = head;
           int n = list.size();
           for(int i=0;i<n;i++){
           ListNode dummy = temp.next;
           ListNode newnode = new ListNode(list.get(i));
           temp.next = newnode;
           newnode.next = dummy;
           temp= dummy;
           }
           return head;
    }
    public static int gcd(int a,int b){
        int c = a%b;
        if(c==0){
            return b;
        }
        a=b;
        b=c;
        return gcd(a,b);
    }
}