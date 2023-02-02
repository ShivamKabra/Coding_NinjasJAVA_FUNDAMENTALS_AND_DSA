package LinkedList;

/*
public class AppendLastN_to_First {
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        int len=0;
        if(n==0){
            return head;
        }
        LinkedListNode<Integer> temp=head, checkNode=null, newHead=null;

        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len<n){
            return head;
        }

        n=len-n;
        temp=head;
        for(int i=1;i<n;i++){
            temp=temp.next;
        }
        checkNode=temp.next;
        newHead=temp.next;
        temp.next=null;


        while(checkNode.next!=null){
            checkNode=checkNode.next;
        }
        checkNode.next=head;
        head=newHead;
        return head;

    }
}
*/
