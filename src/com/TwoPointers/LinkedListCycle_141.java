//package com.TwoPointers;
//
//import com.linkedList.ListNode;
//
///*
//
//5.10
//141. Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/
// */
//public class LinkedListCycle_141 {
//    public boolean hasCycle(ListNode head) {
//
//        if(head==null) { return false;}
//
//        ListNode l1 = head;
//        ListNode l2 = head.next;
//
//        while(l1!=null && l2!=null && l2.next!=null){
//
//
//            if(l1==l2){
//                return true;
//            }
//
//            l1 = l1.next;
//            l2 = l2.next.next;
//
//
//        }
//        return false;
//    }
//
//}
