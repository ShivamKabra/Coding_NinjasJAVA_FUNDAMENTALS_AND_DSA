package Test2;

public class Next_Number {
    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }

    public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
        if(head.next==null)
            return head;

        LinkedListNode<Integer> prev = null,curr = head;
        while(curr!=null) {
            LinkedListNode<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;

    }

    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

        head = reverseLL(head);
        int carry = 1;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            int sum = temp.data + carry ;
            temp.data = sum%10;
            carry = sum/10;
            temp=temp.next;
        }



        if(carry==1){
            temp=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(carry) ;
            temp.next = newNode;
        }

        return reverseLL(head);


    }


    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput();
//    	head = reverseLL(head);
        head = nextLargeNumber(head);
        print(head);

    }
}
