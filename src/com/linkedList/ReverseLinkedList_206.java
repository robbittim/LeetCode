package com.linkedList;

/*
206. Reverse Linked List

https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {

        if(head == null ) return head;

        ListNode temp = null;

        ListNode curr = head;

         while(curr !=null){
             ListNode next = curr.next;
             curr.next = temp;
             temp = curr;
             curr = next;

         }

    
        return temp;




    }

}
