/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 *
}
*/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {return head;}
        ListNode currentNode = head, nextNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                nextNode = currentNode.next.next;
                currentNode.next = nextNode;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}