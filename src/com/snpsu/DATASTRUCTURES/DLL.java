package com.snpsu.DATASTRUCTURES;

public class DLL {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    DLL() {
        head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);

        if (head != null) {
            n.next = head;
            head.prev = n;
        }

        head = n;
    }
    void insertAtTail(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }
    void deleteAtHead(){

    }
    void deletebyvalue(int val){

    }
}
