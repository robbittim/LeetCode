package com;
import java.util.LinkedList;
import java.io.*;

/*
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a sorted list.
The list should be made by splicing together the nodes of the first two lists.

https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //create temp listNode
        ListNode temp = new ListNode(-1);
        ListNode first = temp;

        while(l1!=null && l2!=null) {
            if(l1.val < l2.val){
                temp.next = l1;
                l1=l1.next;
            }else {
                temp.next =l2;
                l2=l2.next;
            }
            temp = temp.next;
        }

        if(l1 !=null){
            temp.next = l1;
        }else {
            temp.next =l2;
        }
        return first.next;
    }

}

