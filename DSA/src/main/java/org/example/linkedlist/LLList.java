package org.example.linkedlist;

import java.util.List;

public class LLList {

    Node head;
    int size;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add a new node at first
    public void addNodeAtFirst(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        head = newNode;
        newNode.next = currentNode;
    }

    //add a new node at Last
    public void addNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    //delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
        }
        head = head.next;
    }

    //delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node currentNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currentNode = currentNode.next;
            lastNode = lastNode.next;
        }
        currentNode.next = null;
    }

    public void reverseLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prev;

            //update
            prev = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseRecursiveLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseRecursiveLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.next;
        }
        System.out.print("NULL");
    }


    public static void main(String args[]) {

        LLList ll = new LLList();
        ll.addNodeAtFirst(1);
        ll.addNodeAtLast(2);
        ll.addNodeAtLast(2);
        ll.addNodeAtLast(1);
        ll.printList();
        System.out.println();

        ll.reverseLinkedList();

        ll.printList();


    }
}

