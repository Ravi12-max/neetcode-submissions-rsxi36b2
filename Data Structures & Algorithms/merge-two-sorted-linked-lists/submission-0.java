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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode c=dummy;
        ListNode a=list1;
        ListNode b=list2;
        while(a!=null && b!=null){
            if(a.val<b.val){
                c.next=a;
                a=a.next;
            }else{
                c.next=b;
                b=b.next;
            }
            c=c.next;
        }
        c.next=(a==null)?b:a;
        return dummy.next;
    }
}