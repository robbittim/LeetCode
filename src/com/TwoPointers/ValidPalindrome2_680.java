package com.TwoPointers;

public class ValidPalindrome2_680 {
    public boolean validPalindrome(String s) {

        int front = 0 ;
        int back = s.length()-1;
        while(front<back){

            if(s.charAt(front) != s.charAt(back)){
                System.out.println("same letter front = " +s.charAt(front) );
                System.out.println("same letter back  = " + s.charAt(back));
                //check substring of s from front to back-1 ; substring of s from front +1 to back
                return helper(s,front,back-1) || helper(s,front+1,back);

            }else {

                System.out.println(s.substring(0,back));

                System.out.println("Not same letter front = " +s.charAt(front) );
                System.out.println("Not same letter back  = " + s.charAt(back));
                front++;
                back--;
            }
        }
        return  true;

    }

    public boolean helper(String s,int front, int back){


        System.out.println("helper string = " + s );

        while(front<back){
            if(s.charAt(front) != s.charAt(back)){
                return false;

            }else{
                front++;
                back--;
            }

        }
        System.out.println("helper return true ");
        return true;

    }

}
