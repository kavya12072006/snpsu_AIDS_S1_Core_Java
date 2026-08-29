package com.snpsu.DATASTRUCTURES.SLL;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
public class SLL {
    Node head;

    SLL() {
        head = null;
    }

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print linked list
    void printSLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args) {
        SLL sll = new SLL();

        // Insert elements
        sll.insert(10);
        sll.insert(20);
        sll.insert(30);
        sll.insert(40);

        // Print list
        sll.printSLL();
    }
}
