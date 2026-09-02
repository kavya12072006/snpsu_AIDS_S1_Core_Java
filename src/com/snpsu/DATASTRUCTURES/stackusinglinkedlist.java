package com.snpsu.DATASTRUCTURES;

public class stackusinglinkedlist {

    Node top = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    void pop() {
        if (top == null)
            System.out.println("Empty");
        else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        stackusinglinkedlist s = new stackusinglinkedlist();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
    }
}