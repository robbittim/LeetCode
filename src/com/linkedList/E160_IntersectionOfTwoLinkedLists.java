package com.linkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
6.5.21
160. Intersection of Two Linked Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/
 */
public class E160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }

            headA = headA.next;
            headB = headB.next;


            if(headA == null  && headB == null){
                break;
            }else if(headA==null){
                headA=tempB;
            }else if(headB==null){
                headB = tempA;
            }

        }
        return null;
    }

}
