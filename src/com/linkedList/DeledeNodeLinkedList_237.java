package com.linkedList;

/*
237. Delete Node in a Linked List
https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeledeNodeLinkedList_237 {

    public void deleteNode(ListNode node) {
        // just skip the current node to the next node, by changing last node's next reference
        // 4 -> 5 -> 1 -> 9
        // 4 skip 5, 4 -> 1 > 9

            node.val = node.next.val;
            node.next = node.next.next;

    }
}
