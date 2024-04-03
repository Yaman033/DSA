package org.example.linkedlist;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) {
            return true;
        }

        //middle
        ListNode firstHalfLastNode = findMiddle(head);

        //reverse second half
        ListNode headOfSecondHalf = reverse(firstHalfLastNode.next);

        ListNode firstHalfHead = head;
        while (headOfSecondHalf.next != null) {
            // compare
            if (firstHalfHead.val != headOfSecondHalf.val) {
                return Boolean.FALSE;
            }
            firstHalfHead = firstHalfHead.next;
            headOfSecondHalf = headOfSecondHalf.next;
        }

        return true;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode rabbit = head;
        ListNode turtle = head;

        while (rabbit.next != null || rabbit.next.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public ListNode reverse(ListNode start) {
        ListNode previousNode = null;
        ListNode currentNode = start;
        while (currentNode != null) {
            ListNode newNode = currentNode.next;
            currentNode.next = previousNode;

            //update
            previousNode = currentNode;
            currentNode = newNode;
        }
        return previousNode;
    }

//    public static void main(String[] args){
//        PalindromeLinkedList pl = new PalindromeLinkedList();
//        ListNode head = new ListNode();
//        pl.isPalindrome()
//
//    }

}
