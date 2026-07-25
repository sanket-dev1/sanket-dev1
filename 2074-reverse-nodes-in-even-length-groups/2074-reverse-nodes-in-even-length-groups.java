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
    public ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        int groupSize = 1;

        while (curr != null) {

            // Count actual nodes in this group
            int count = 0;
            ListNode temp = curr;
            while (temp != null && count < groupSize) {
                temp = temp.next;
                count++;
            }

            // Reverse if group length is even
            if (count % 2 == 0) {

                ListNode nextGroup = temp;

                ListNode prevNode = nextGroup;
                ListNode node = curr;

                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = prevNode;
                    prevNode = node;
                    node = next;
                }

                prev.next = prevNode;
                prev = curr;
                curr = nextGroup;

            } else {

                // Move prev and curr forward
                for (int i = 0; i < count; i++) {
                    prev = curr;
                    curr = curr.next;
                }
            }

            groupSize++;
        }

        return dummy.next;
    }
}