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
        ListNode dummy=null;
        for(ListNode node:lists){
           dummy= merge(dummy,node);
        }
        return dummy;
    }
    public ListNode merge(ListNode list1,ListNode list2){
        if(list1==null && list2==null) return null;
        ListNode dumm = new ListNode(-1);
        ListNode c=dumm;
        ListNode a=list1;
        ListNode b=list2;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                c.next=a;
                a=a.next;
            }else{
                c.next=b;
                b=b.next;
            }
            c=c.next;
        }
        c.next=(a==null)?b:a;
        return dumm.next;
    }
}
