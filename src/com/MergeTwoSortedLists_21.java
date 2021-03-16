package com;

/*
21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a sorted list.
The list should be made by splicing together the nodes of the first two lists.

https://leetcode.com/problems/merge-two-sorted-lists/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MergeTwoSortedLists_21 {
    public ListNode_21 mergeTwoLists(ListNode_21 l1, ListNode_21 l2) {

        //create temp listNode
        ListNode_21 temp = new ListNode_21(-1);
        ListNode_21 first = temp; // point to the first element of the temp list

        while(l1!=null && l2!=null) {
            // compare the 1st element in two lists
            // which one is smaller, add that to temp list
            // then move to next
            if(l1.val < l2.val){
                temp.next = l1;  // put the l1 element into temp list
                l1=l1.next; // move to next l1 value
            }else {
                temp.next =l2;
                l2=l2.next; // move to next l2 value
            }
            temp = temp.next; // move to next element in temp list
        }

        if(l1 !=null){
            temp.next = l1; // l1 is longer than l2, so add l1 element into temp list
        }else {
            temp.next =l2;
        }
        return first.next; // after while loop, temp list contains all the element in l1/l2
                            // return first which contains the reference of the beginning of the list
    }

}

