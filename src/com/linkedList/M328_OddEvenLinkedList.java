package com.linkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

/*
6.22.21
328. Odd Even Linked List
https://leetcode.com/problems/odd-even-linked-list/
 */
public class M328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

     if(head==null) return null;
     //the 1st node is always odd
     ListNode odd = head;
     //the 2nd node is always even
     ListNode even = head.next;
     //new Head, always point to even
     ListNode evenHead = even;

     while(even!=null && even.next!=null){

         //odd's next node is even's next node
        odd.next = even.next;
        // move odd forward
        odd = odd.next;
        //even's next node is odd's next node
        even.next = odd.next;
        //move even forward
        even = even.next;
     }
     //since we reach the end of the list
     // odd's next node should be the Head of the evenList
     odd.next = evenHead;
        return head;

    }
}
