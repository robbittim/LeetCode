package com.linkedList;

/*
6.5.21
206. Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/
 */
public class E206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head == null ) return head;

        ListNode temp = null;

         while(head !=null){
             ListNode next = head.next;
             head.next = temp;
             temp = head;
             head = next;

         }

    
        return temp;




    }

}
