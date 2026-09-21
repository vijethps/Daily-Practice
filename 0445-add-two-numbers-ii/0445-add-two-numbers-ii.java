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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode temp = l1;
        while(temp != null){
            s1.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp != null){
            s2.push(temp.val);
            temp = temp.next;
        }
        String ans = "";
        int carry = 0;
        while(!s1.isEmpty() && !s2.isEmpty()){
            int a = s1.pop();
            int b = s2.pop();
            int c = a+b+carry;
            if(c<10){
                ans+=String.valueOf(c);
                carry = 0;
            }
            else{
                ans+=String.valueOf(c%10);
                carry = c/10;
            }
        }
        while(!s1.isEmpty()){
            int c = s1.pop() + carry;
            ans += String.valueOf(c % 10);
            carry = c / 10;
        }
        while(!s2.isEmpty()){
            int c = s2.pop()+carry;
            ans+=String.valueOf(c%10);
            carry = c/10; 
        }
        if(carry != 0){
            ans+=String.valueOf(carry);
        }
        char ch[] = ans.toCharArray();
        ListNode node = new ListNode(ch[ch.length-1]-'0');
        ListNode dummy = node;
        temp = dummy;
        for(int i=ch.length-2;i>=0;i--){
            ListNode nnode = new ListNode(ch[i]-'0');
            temp.next = nnode;
            temp = nnode;
        }
        l1 = null;
        l2=null;
        return dummy;
    }
}