package Test2;

public class Delete_alternate_Nodes {
    public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
        while(head.next!=null){
            if(head.next.next!=null){
                head.next=head.next.next;
                head=head.next;
            }else{
                head.next=null;
            }
        }
    }
}
