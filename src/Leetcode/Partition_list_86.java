package Leetcode;

public class Partition_list_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode higher = new ListNode(0);

        ListNode smallHead = small, higherHead = higher;

        while(head!=null){
            if(head.val<x){
                // small
                smallHead.next = head;
                smallHead = smallHead.next;
            }else{
                // higher
                higherHead.next = head;
                higherHead=higherHead.next;
            }
            head = head.next;
        }

        smallHead.next = higher.next;
        higherHead.next = null;

        return small.next;
    }
}
