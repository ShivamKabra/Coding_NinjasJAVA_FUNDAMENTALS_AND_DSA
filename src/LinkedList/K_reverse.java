package LinkedList;

/*public class K_reverse {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr=head, pre=null;

        while(curr!=null){
            LinkedListNode<Integer> temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }


    public static int len(LinkedListNode<Integer> head){
        int count =0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {

        if(k==0 || k==1){
            return head;
        }
        //Your code goes here
        if(k>len(head)){
            return reverse(head);
        }
        LinkedListNode<Integer> temphead=head;
        for(int i=1;i<k;i++){
            head=head.next;
        }
        LinkedListNode<Integer> temp = head.next;
        head.next=null;
        LinkedListNode<Integer> reversehead=reverse(temphead);
        LinkedListNode<Integer> tail=temphead;
        LinkedListNode<Integer> smallAns=kReverse(temp, k);
        tail.next=smallAns;
        return reversehead;

    }
}*/
