package com.queue_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
5.20.21
20. Valid Parentheses
https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses_20 {
    /**
     * Make a stack, if the s.charAt(c) is a OPEN bracket,  put it in a stack
     * and if it is a CLOSE bracket, then we check the top of a stack
     * is it is a valid match {} () [], true then we pop the element
     * and in the end we check if the stack is empty then we return true otherwise we return false
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c=='(' || c=='[' || c =='{'){
                stack.add(c);
            }else{

                if(stack.isEmpty()) return false;
                if(stack.peek()=='(' && c!=')') return false;
                if(stack.peek()=='[' && c!=']') return false;
                if(stack.peek()=='{' && c!='}') return false;

                stack.pop();
            }
        }

        return stack.isEmpty();

    }


}
