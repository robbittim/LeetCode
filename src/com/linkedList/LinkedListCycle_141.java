package com.linkedList;

import java.util.HashSet;
import java.util.Set;
/*
141. Linked List Cycle
https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle_141 {

    public boolean hasCycle(ListNode head) {

        if(head==null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow !=fast){

            if(fast==null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;

        }
        return true;

    }
}
