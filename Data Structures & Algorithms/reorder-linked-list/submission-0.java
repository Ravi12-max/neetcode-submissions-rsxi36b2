class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode fwdHead=slow.next;
        slow.next=null;
        fwdHead=reverse(fwdHead);
        ListNode temp=head;
        while(fwdHead!=null){
            ListNode next1=temp.next;
            ListNode next2=fwdHead.next;
            temp.next=fwdHead;
            fwdHead.next=next1;
            temp=next1;
            fwdHead=next2;
        }

    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode fwd;
        ListNode curr=head;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
}
