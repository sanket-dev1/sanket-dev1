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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return new int[]{-1,-1};
        }
        int index=1;
        List<Integer> ls=new ArrayList<>();
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr.next != null){
            ListNode next=curr.next;
            if((curr.val<prev.val && curr.val < next.val) || (curr.val>prev.val && curr.val > next.val)){
                ls.add(index);
            }
            index++;
            prev=curr;
            curr=next;
        }
         if (ls.size() < 2) {
            return new int[]{-1,-1};
        }

        // Maximum distance = last critical point - first critical point
        int max = ls.get(ls.size() - 1) - ls.get(0);

        // Minimum distance between consecutive critical points
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < ls.size(); i++) {
            int distance = ls.get(i) - ls.get(i - 1);
            min = Math.min(min, distance);
        }

        return new int[]{min, max};
    }
}

// class Solution {
//     public int[] nodesBetweenCriticalPoints(ListNode head) {
//         int min = 100000, i = 1;
//         int first = 0, last = 0;

//         ListNode prev = head, curr = head.next, nxt = head.next.next;

//         while (nxt != null) {
//             if (isCrit(prev, curr, nxt)) {
//                 if (first == 0) first = i;
//                 else min = Math.min(min, i - last);
//                 last = i;
//             }

//             prev = curr; curr = nxt;
//             nxt = nxt.next; i++;
//         }

//         if (first == last) return new int[]{-1, -1};

//         return new int[]{min, last - first};
//     }
    
//     boolean isCrit(ListNode a, ListNode b, ListNode c) {
//         return (a.val < b.val && b.val > c.val) ||
//                (a.val > b.val && b.val < c.val);
//     }
// }