class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
}
