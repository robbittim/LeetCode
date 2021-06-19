package com.linkedList;

public class M19_RemoveNthNodeFromList {

 /*
6.8.21
19. Remove Nth Node From End of List
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
 public ListNode removeNthFromEnd(ListNode head, int n) {

     /**
      * Using counter, 2 loops
      */
//     ListNode temp = new ListNode(0);
//     temp.next = head;// the reference of the head,
//     // if we modify anything with the head, once we return the temp.next, we get the head
//     int counter = 0;
//
//     ListNode firstNode = head;
//
//     while(firstNode!=null){
//         counter ++;
//         firstNode = firstNode.next;
//     }
//
//     counter = counter - n;
//
//     firstNode = temp;
//
//     while(counter>0){
//         counter --;
//         firstNode= firstNode.next;
//     }
//
//     // remove the nth node, and point current node to the next node of the deleted node
//     firstNode.next = firstNode.next.next;
//
//     System.out.println("counter = " + counter);
//
//     return temp.next;


     /**
      * Using two pointers
      */

     ListNode temp = new ListNode(0);

     temp.next = head;
     ListNode slow = temp;
     ListNode fast = temp;

     for(int i = 0; i < n+1; i ++) {
        fast = fast.next;

     }

     while(fast!=null){
        slow = slow.next;
        fast = fast.next;
     }

     slow.next = slow.next.next;

     return temp.next;


 }

}
