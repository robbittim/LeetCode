package com.linkedList;
/*
83. Remove Duplicates from Sorted List

https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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

public class E83_RemoveDuplicatesFromSortedList {

    public ListNode_21 deleteDuplicates(ListNode_21 head) {

        ListNode_21 current = head;

        while(current!=null && current.next!=null){
            if(current.val==current.next.val){ // check if the next value is the same as current value
                current.next = current.next.next; // true -> next node = next's next node, so we skip over the next node
            }else{
                current=current.next; //false -> move the current node to next node, regular traversal

            }
        }
        return head;
    }



}
