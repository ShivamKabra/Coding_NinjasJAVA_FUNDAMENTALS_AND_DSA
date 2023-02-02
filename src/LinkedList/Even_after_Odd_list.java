package LinkedList;

public class Even_after_Odd_list {
   /* public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode odd_head=null, odd_tail=null, even_head=null, even_tail=null;
        if(head==null){
            //System.exit(0);
            return head;
        }
        while(head!=null){
            if(head.data%2!=0){
                if(odd_head!=null){
                    odd_tail.next=head;
                    odd_tail=head;

                }else{
                    odd_head=head;
                    odd_tail=head;
                }
            }else{
                if(even_head!=null){
                    even_tail.next=head;
                    even_tail=head;

                }else{
                    even_head=head;
                    even_tail=head;
                }
            }
            head=head.next;

        }



        if(odd_head==null){
            even_tail.next=null;
            return even_head;
        }
        else if(even_head==null){
            odd_tail.next=null;
            return odd_head;
        }
        odd_tail.next=even_head;

        return odd_head;

    }*/




}
