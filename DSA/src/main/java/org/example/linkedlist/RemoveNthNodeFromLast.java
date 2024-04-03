package org.example.linkedlist;

import java.util.List;

public class RemoveNthNodeFromLast {

    public void removeNthNode(ListNode head, int n) {
        if (head == null || head.next == null) {
            System.out.println(head);
            return; //head
        }

        ListNode currentNode = head;
        int size = 0;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        int indexToSearch = size - n;
        int i = 0;
        ListNode previousNode = head;
        while (i < indexToSearch) {
            previousNode = previousNode.next;
            i++;
        }
        previousNode.next = previousNode.next.next;
    }
}
