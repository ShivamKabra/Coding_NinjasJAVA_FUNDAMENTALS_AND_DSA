package LinkedList;

public class ReverseLinkedList {
    // Order of N^2 solution
   /* public static void printReverse(LinkedListNode<Integer> root) {
        //Your code goes here

        LinkedListNode<Integer> temp=root;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=root;
        int a=1;
        for(int i=0;i<count;i++){
            while(a<=count-i){
                if (a==count-i) {
                    System.out.print(temp.data + " ");

                }
                temp=temp.next;
                a++;

            }
            a=1;
            temp=root;

        }

    }*/





    // Order of N
   /* public static void printReverse(LinkedListNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        printReverse(root.next);
        System.out.print(root.data+" ");

    }*/

    // Function
   /* public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode newhead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }*/
}
