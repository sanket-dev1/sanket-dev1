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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        int count=0;
        ListNode temp=head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        int skip=count-k;
        ListNode second=head;
        for(int i=0;i<skip;i++){
            second=second.next;
        }
        int tempk=first.val;
        first.val=second.val;
        second.val=tempk;
        return head;
    }
} 