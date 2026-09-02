//package com.snpsu.DATASTRUCTURES;
//
//class Node{
//    int data;
//Node next; // pointing towards node obj
//
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SLL {
//    Node head;
//    SLL(){
//        this.head = null;
//    }
//
//    void insertAtHead(int val){
//        com.snpsu.DATASTRUCTURES.bs.Node n = new com.snpsu.DATASTRUCTURES.bs.Node(val); // create node
//        n.next = head;
//        head = n;
//    }
//
//    void insertAtTail(int val){
//        com.snpsu.DATASTRUCTURES.bs.Node n = new com.snpsu.DATASTRUCTURES.bs.Node(val); // create node
//        if(head==null){
//            head = n;
//            return;
//        }
//        com.snpsu.DATASTRUCTURES.bs.Node temp = head;
//        while(temp.next!=null){
//            temp = temp.next;
//        }
//        temp.next = n;
//    }
//
//    int getLLSize(){
//        int size = 0;
//        com.snpsu.DATASTRUCTURES.bs.Node temp = head;
//        while(temp!=null){
//            temp= temp.next;
//            size++;
//        }
//        return size;
//    }
//
//    void insertAtPos(int val, int pos){
//        com.snpsu.DATASTRUCTURES.bs.Node n = new com.snpsu.DATASTRUCTURES.bs.Node(val);
//        int size = getLLSize();
//        if(pos < 0 || pos > size){
//            System.out.println("Get Lost");
//        }else if(pos == 0){
//            n.next = head;
//            head = n;
//        }else{
//            com.snpsu.DATASTRUCTURES.bs.Node temp = head;
//            while(--pos > 0){
//                temp = temp.next;
//            }
//            n.next = temp.next;
//            temp.next = n;
//        }
//    }
//    void deteAtHead(){
//        if (head==null){
//            System.out.println("linked list is empty");
//            return;
//        }
//        com.snpsu.DATASTRUCTURES.bs.Node todelete =head;
//        head=head.next;
//        todelete=null;//call garbage collection
//    }
//    void deletebyvalue(int val){
//        if(head==null){
//            System.out.println("linked list is empty");
//            return;
//        }
//        if(head.data==val){
//            deteAtHead();
//            return;
//        }
//        com.snpsu.DATASTRUCTURES.bs.Node temp=head;
//        while(temp.next!=null&&temp.next.data!=val){
//            temp=temp.next;
//        }
//        com.snpsu.DATASTRUCTURES.bs.Node toDelete = temp.next;
//        temp.next = temp.next.next;
//        toDelete =null;
//    }
//
//    void printSLL(){
//        com.snpsu.DATASTRUCTURES.bs.Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("Null");
//    }
//}
//
//class Driver{
//    public static void main(String[] args) {
//        SLL sll = new SLL();
//        sll.insertAtTail(23);
//        sll.printSLL();
//        sll.insertAtHead(10);
//        sll.insertAtHead(20);
//        sll.insertAtHead(30);
//        sll.printSLL();
//        sll.insertAtHead(40);
//        sll.printSLL();
//        sll.insertAtPos(500, 4);
//        sll.printSLL();
//    }
//}