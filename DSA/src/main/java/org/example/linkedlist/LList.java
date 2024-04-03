package org.example.linkedlist;


public class LList {

    Node head;
    int size;

    LList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is null");
            return;
        }
        head = this.head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is null");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node currentNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currentNode = currentNode.next;
            lastNode = lastNode.next;
        }
        //remove last element
        currentNode.next = null;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "--> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }


    public static void main(String[] args) {
        LList lList = new LList();
        lList.addFirst("Yaman");
        lList.addFirst("Virmani");
        lList.addLast("LeetCode");
        lList.printList();
        lList.deleteFirst();
        lList.printList();
        lList.deleteLast();
        lList.printList();
    }
}
