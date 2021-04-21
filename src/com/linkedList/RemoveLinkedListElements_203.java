package com.linkedList;

import java.util.ArrayList;
import java.util.List;
/*
203. Remove Linked List Elements
https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {

       while(head!=null && head.val == val){
           head = head.next;
       }

       ListNode temp = head;

       while(temp!=null && temp.next!=null){
           if(temp.next.val ==val){
               temp.next = temp.next.next;
           }else{
               temp = temp.next;
           }

       }

        return head;

    }



}
