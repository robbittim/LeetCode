package com.linkedList;

/*
6.10.21
445. Add Two Numbers II
https://leetcode.com/problems/add-two-numbers-ii/
 */
public class M445_AddTwoNumber2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // reverse two lists, so we can add the value for the last node
        ListNode reverseL1 = reverseList(l1);
        ListNode reverseL2 = reverseList(l2);

        // create dummy node
        ListNode head = new ListNode(-1);
        ListNode currentNode = head;

        int carry = 0;
        while(reverseL1!=null || reverseL2!=null || carry!=0){
            int l1Val = 0;
            int l2Val = 0;

            if(reverseL1!=null){
             l1Val = reverseL1.val;
            }

            if(reverseL2!=null){
                l2Val = reverseL2.val;
            }

            int sum = carry + l1Val + l2Val;

            int remainder = sum % 10;
            carry = sum / 10;

            /** input:
             *  [7,2,4,3]
             *    [5,6,4]
             *
             * remainder = 7
             * carry = 0
             * remainder = 0
             * carry = 1
             * remainder = 8
             * carry = 0
             * remainder = 7
             * carry = 0
             */
            System.out.println("remainder = " + remainder);
            System.out.println("carry = " + carry);

            // we construct the next node one by one with value of remainder
            currentNode.next = new ListNode(remainder);
            currentNode = currentNode.next;

           if(reverseL1!=null)   reverseL1 = reverseL1.next;
           if(reverseL2!=null)   reverseL2 = reverseL2.next;

        }

        // then we reverse the final list to get the correct order
        return reverseList(head.next);

    }

    public ListNode reverseList (ListNode l1){

        ListNode temp1= null;

        while(l1!=null){
            ListNode next = l1.next;
            l1.next = temp1;
            temp1 = l1;
            l1 = next;
        }
        return temp1;
    }

}
