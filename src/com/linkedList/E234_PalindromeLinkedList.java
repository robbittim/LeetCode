package com.linkedList;

public class E234_PalindromeLinkedList {


    /*
    06.19.21
    234. Palindrome Linked List
    https://leetcode.com/problems/palindrome-linked-list/submissions/
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null) return true;

        ListNode fast = head;
        ListNode slow = head;

        //make sure pointer fast reach at the end first
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            System.out.println("fast = " + fast);
            System.out.println("slow = " + slow);
        }

        /**
         *         reverse the list from the middle to the end
         *         slow will be at 4th position, 3
         *
         *                 slow
         *          1 2 3 , 3 2 1 -> 1 2 3, 1 2 3
         *
         *          reverse 3,2,1 to 1,2,3
         *
         *          compare 1,2,3 with 1,2,3, if node's value are diff, then its not palindrome
         *          1 2 3 > 3 2 1
         *          1 2 3 > 1 2 3
          */

        slow = reverse(slow);
        //fast will now be the head, so compare from the beginning
        fast = head;

        while(slow!=null) {
            // compare two value in the two same list
            // if the value is diff, then its not palindrome
            if(slow.val != fast.val) {
            return false;
            }
            slow = slow.next;
            fast = fast.next;

        }

        return true;

    }


    public ListNode reverse(ListNode head){

        ListNode prev = null;

        while(head!=null){

            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
        return prev;
    }
}
