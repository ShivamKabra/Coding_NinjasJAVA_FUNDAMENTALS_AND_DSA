/*
package LinkedList;

public class MergeSort_LL {
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes
        LinkedListNode slow=head, fast=head, temp=head;
        if(head==null || head.next==null){
            return head;
        }
        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        temp.next=null;
        LinkedListNode left_side=mergeSort(head);
        LinkedListNode right_side=mergeSort(slow);

        return merge(left_side, right_side);
    }

    public static LinkedListNode merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
        LinkedListNode temp_node=new LinkedListNode(0);
        LinkedListNode current_node= temp_node;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                current_node.next=head1;
                head1=head1.next;
            }else{
                current_node.next=head2;
                head2=head2.next;
            }
            current_node=current_node.next;
        }
        if(head1!=null){
            current_node.next=head1;
            head1=head1.next;
        }
        if(head2!=null){
            current_node=head2;
            head2=head2.next;
        }

        return temp_node.next;


    }

     public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if (head1==null)
        {
            return head2;
        }

        if (head2==null)
        {
            return head1;
        }

        LinkedListNode<Integer> newHead=null,node1=head1,node2=head2,newNode=null;
        int data1=node1.data,data2=node2.data;
        if (data1<data2)
        {
            newHead=node1;
            node1=node1.next;
        }
        else
        {
            newHead=node2;
            node2=node2.next;
        }
        newNode=newHead;
        while(node1!=null && node2!=null)
        {
            data1=node1.data;
            data2=node2.data;
            if (data1<data2)
            {
                newNode.next=node1;
                newNode=newNode.next;
                node1=node1.next;
            }
            else
            {
                newNode.next=node2;
                newNode=newNode.next;
                node2=node2.next;
            }
        }

        while(node1!=null)
        {
            newNode.next=node1;
            newNode=newNode.next;
            node1=node1.next;
        }
        while (node2!=null)
        {
            newNode.next=node2;
            newNode=newNode.next;
            node2=node2.next;
        }
        return newHead;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        //Handling base case where length of linked is 0 or 1
        if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> midNode=midPoint(head),part1Head=head,part2Head=null;
        part2Head=midNode.next;
        midNode.next=null;
        LinkedListNode<Integer> head1=mergeSort(part1Head);
        LinkedListNode<Integer> head2=mergeSort(part2Head);
        LinkedListNode<Integer> newHead=mergeTwoSortedLinkedLists(head1,head2);
        return newHead;
	}

}
*/
