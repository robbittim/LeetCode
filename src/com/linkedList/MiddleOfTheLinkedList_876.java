package com.linkedList;

import java.util.ArrayList;
import java.util.List;

/*
876. Middle of the Linked List
https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList_876 {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;

        while(head!=null){
            list.add(head);
            head = head.next;
        }
        int size  = list.size();
        System.out.println(list.size());
        int middle = 0;
        if(size%2 == 1){
            middle = size/2;
        }else{
            middle = size/2;
        }

        for(int i = 0; i <middle;i++){
            list.add(temp);
            temp = temp.next;
        }

        System.out.println("middle = " + middle);

        return temp;

    }
}
