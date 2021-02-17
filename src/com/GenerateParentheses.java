package com;
import java.util.ArrayList;
import java.util.List;

/*
########################
2.17.21 - CANT SOLVE
########################

LeetCode 22. Generate Parentheses
https://leetcode.com/problems/generate-parentheses/solution/

Have idea, understand the total parentheses are n * 2

 */

//TODO: revisit this question and do it again!

public class GenerateParentheses {


    public  List<String> generateParenthesis(int n) {

        List<String> output = new ArrayList<>();
        backtrack(output,"",0,0,n);
        System.out.println(output.toString());
        return output;

    }
    public void backtrack(List<String> ans, String current,int open,int close,int max){

        if(current.length()== max*2){
            ans.add(current);
            return;
        }
        if(open<max){
            backtrack(ans,current+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(ans,current+")",open,close+1,max);
        }

    }
}
