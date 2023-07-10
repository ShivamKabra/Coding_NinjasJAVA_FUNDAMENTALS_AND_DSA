package Leetcode;

public class Odd_even_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode odd_list = new ListNode(0);
        ListNode even_list = new ListNode(0);

        ListNode odd_head = odd_list, even_head = even_list;
        int count=1;
        while(head!=null){
            if(count%2!=0){
                //odd list
                odd_head.next = head;
                odd_head = odd_head.next;
            }else{
                //even list
                even_head.next = head;
                even_head = even_head.next;
            }
            count++;
            head=head.next;
        }
        even_head.next = null;
        odd_head.next = even_list.next;

        return odd_list.next;
    }
}
