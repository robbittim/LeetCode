package com.queue_stack;

import java.util.Stack;
/*
5.17.21
232. Implement Queue using Stacks
https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class ImplementQueueUsingStacks_232 {
    class MyQueue {
        Stack<Integer> input = new Stack<Integer>();
        Stack<Integer> output = new Stack<Integer>();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
          input.push(x);

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
           if(output.isEmpty()){
               shiftInputToOutput();
           }
           return output.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(output.isEmpty()){
                shiftInputToOutput();
            }
            return output.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {

            return input.isEmpty()&&output.isEmpty();
        }
        //helper method: shift all the element from input stack to output stack
        //so the output stack is a queue - FIFO
        public void shiftInputToOutput(){
            while(!input.isEmpty()){
                int temp = input.pop();
                output.push(temp);
            }

        }

    }

}
