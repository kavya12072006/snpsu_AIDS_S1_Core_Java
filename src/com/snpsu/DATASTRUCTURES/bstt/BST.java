//package com.snpsu.DATASTRUCTURES.bstt;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class BST {
//    Node root;
//
//    BST() {
//        root = null;
//    }
//
//    private Node insertRec(Node root, int key) {
//        if (root == null) {
//            return new Node(key);
//        }
//
//        if (key < root.data) {
//            root.left = insertRec(root.left, key);
//        } else if (key > root.data) {
//            root.right = insertRec(root.right, key);
//        }
//
//        return root;
//    }
//
//    void insert(int key) {
//        root = insertRec(root, key);
//    }
//
//    private boolean searchRec(Node root, int key) {
//        if (root == null) {
//            return false;
//        }
//
//        if (key == root.data) {
//            return true;
//        }
//
//        if (key < root.data) {
//            return searchRec(root.left, key);
//        } else {
//            if(root.left==null){
//                return root.right;
//            }else if(root.right==null){
//                return root.left;
//            }
//            //case2 node with 2 children
//            Node successor = findSuccessor(root.right);
//            root.data=successor.data;
//            root.right=removeRec(root.right,successor.data);
//        }
//    }
//    private Node findSuccessor(Node node){
//        while(node.left!)
//    }
//
//    boolean search(int key) {
//        return searchRec(root, key);
//    }
//
//    // Inorder DFS
//    void inorder(Node root) {
//        if (root == null) {
//            return;
//        }
//
//        inorder(root.left);
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }
//}
//
//class Driver {
//    public static void main(String[] args) {
//
//        BST bst = new BST();
//
//        bst.insert(100);
//        bst.insert(35);
//        bst.insert(42);
//        bst.insert(98);
//
//        System.out.println(bst.search(70));
//
//        System.out.print("Inorder DFS: ");
//        bst.inorder(bst.root);
//    }
//}