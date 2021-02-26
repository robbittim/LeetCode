package com;

import java.util.Stack;

/*

########################
2.25.21 - CANT SOLVE

Typical Stack question
########################


20. Valid Parentheses

https://leetcode.com/problems/valid-parentheses/


 */
public class ValidParentheses {

    public boolean isValid(String s) {

     if(s.length()%2!=0)
         return false;

        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
           if(c=='(')
               stack.push(')');
           else if (c=='{')
               stack.push('}');
           else if (c=='[')
               stack.push(']');
           else if (stack.isEmpty() || stack.pop()!=c)
               return false;
        }
        return stack.isEmpty();
    }

}
