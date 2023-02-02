package LinkedList;

public class MergeTwoSortedLinkedListe {
  /*  public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        LinkedListNode<Integer> t1=head1, t2=head2 ;
        LinkedListNode<Integer> head=null, tail=null;
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }

        if(t1.data<=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null){
            tail.next=t1;
        }else{
            tail.next=t2;
        }
        return head;
    }*/

}
