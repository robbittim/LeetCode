package com.queue_stack;

import java.util.Stack;
/*
5.19.21
155. Min Stack
https://leetcode.com/problems/min-stack/
 */
public class MinStack_155 {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> min_stack = new Stack<>();

    class MinStack {

        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int val) {
            s1.push(val);
            if(min_stack.isEmpty() || val <= min_stack.peek()){
                min_stack.push(val);
            }
        }

        public void pop() {
            if(s1.peek().equals(min_stack.peek())){
                min_stack.pop();
            }

          s1.pop();
        }

        public int top() {
          return s1.peek();
        }

        public int getMin() {

            return min_stack.peek();

        }
    }
}
