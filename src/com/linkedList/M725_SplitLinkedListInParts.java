package com.linkedList;

/*
6.20.21
725. Split Linked List in Parts
https://leetcode.com/problems/split-linked-list-in-parts/
 */
public class M725_SplitLinkedListInParts {

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        ListNode count_list = head;

        ListNode length_smaller_than_kvale = head;

        ListNode length_greater_than_kvalue = head;

        int counter = 0;


        //count how many node in the list
        while(count_list!=null){

            count_list = count_list.next;
            counter ++ ;

        }

        System.out.println("counter = " + counter);

        //since the head.length is less than k,
        //so the ans[] is all the node in the head, with the null value after
        if(counter < k){
            System.out.println("length is less than k ");

            for(int i = 0;i<counter;i++){
                ans[i] = new ListNode(length_smaller_than_kvale.val);
                length_smaller_than_kvale = length_smaller_than_kvale.next;

            }

        }

        /**
         *
         * head.length > k
         * need to split the ListNode into ans[]
         *
         * Input LinkList head [1,2,3,4,5,6,7,8,9,10]
         * length= 10, and k = 3
         *
         * the ans[] can be divided by [1,2,3,4], [5,6,7], [8,9,10]
         *
         * int div = 10 / 3 = 3.333 = 3
         * int remainder = 10 % 3 = 1
         *
         * so the length of the index in the ans[] is : div + mod = 3 + 1 = 4
         *
         *
         */
        else{

            int div = counter / k;  // Get how many part it can really divided.
            int remainder = counter % k; // Get how many additional one node need to be added from start.

            ListNode prev = null;

            for(int i = 0; i<k;  i++, remainder--){

                ans[i] = length_greater_than_kvalue;

                // get the correct length of the index
                int lengthWithRemainder = div + ((remainder>0)?1:0);

                // 2nd loop: we only need the node from 0 to the lengthWithRemainder

                for(int j=0; j<lengthWithRemainder; j++){

                    prev = length_greater_than_kvalue;
                    length_greater_than_kvalue = length_greater_than_kvalue.next;

                }

                //now we finish the 2nd loop, since prev is point to length_greater_than_kvalue
                //we want to break now, so prev.next is null

                if(prev!=null) {
                    prev.next=null;
                }

            }

        } // end else


        return ans;

    }
}
