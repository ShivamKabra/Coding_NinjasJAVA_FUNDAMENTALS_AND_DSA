package LinkedList;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> takeInput(){
        Node<Integer> head=null, tail=null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while(data!=-1){
            Node<Integer> newNode= new Node<>(data);
           if(head==null){
               head=newNode;
               tail=newNode;
           }
           else{
              /* Node<Integer> temp=head;
               while(temp.next!=null){
                   temp=temp.next;
               }
               temp.next=newNode;*/
              tail.next=newNode;
              tail=newNode;
           }
           data=sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode = new Node<>(data);
        int i=0;
        if(pos==0){
            newNode.next=head;
            return newNode;
        }
        Node<Integer> temp = head;
        while( i<pos-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }
    public static void printRecursive(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        printRecursive(head.next);
    }

    public static Node<Integer> insertRecursive(Node<Integer> head, int pos, int element){
        if(pos==0){
            Node<Integer> newNode=new Node<>(element);
            newNode.next=head;
            return newNode;
        }
        if(head==null){
            return head;
        }
        head.next=insert(head.next, pos-1, element);
        return head;
    }

    public static void main(String[] args) {
//        Node<Integer> node1= new Node<>(10);
//       /* System.out.println(node1.data);
//        System.out.println(node1.next);*/
//        Node<Integer> node2=new Node<>(20);
//        node1.next=node2;
//        /*System.out.println(node1.next);
//        System.out.println(node2);*/
//        Node<Integer> node3=new Node<>(30);
//        node2.next=node3;
//        Node<Integer> head=node1;
//        print(head);
//        print(head);
        Node<Integer> head=takeInput();
        //head = insert(head, 80, 0);
        increment(head);
        print(head);
        printRecursive(head);
    }
}
