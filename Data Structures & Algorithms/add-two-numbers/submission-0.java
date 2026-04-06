class Solution {
   
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode dummy = new ListNode(-1);
        int carry=0;
        ListNode curr=dummy;
        while(head1!=null || head2!=null || carry!=0){
            int sum=carry;
            if(head1!=null){
                sum +=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                sum +=head2.val;
                head2=head2.next;
            }
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
        }
        
        return dummy.next;
    }
}
