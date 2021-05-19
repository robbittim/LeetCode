package com.queue_stack;

import java.util.*;
/*
5.18.21
225. Implement Stack using Queues
https://leetcode.com/problems/implement-stack-using-queues/
 */
public class ImplementStackUsingQueues_225 {
    class MyStack {

        private Queue<Integer> q1 = new LinkedList<>();


        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */

        /**
         * push x first, because it is a queue, it will stored at the back of the queue
         * then we get the head of the queue, also remove it, then push, so the element will behind the x
         * now the queue become LIFO order
         */
        public void push(int x) {
            q1.add(x);
            int size = q1.size();
            while(size >1) {
                int reverse = q1.remove();
                q1.add(reverse);
                size --;
            }

        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {

        return q1.remove();
        }

        /** Get the top element. */
        public int top() {


            return q1.peek();
        }


        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
