package com;

/*
66. Plus One
https://leetcode.com/problems/plus-one/
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
/*
        long num =0;
      long ans =0;

      for(int i =0;i<digits.length;i++){

          num = num*10+digits[i];
          // the max value for int is 2147483647 that is less than 9876543210
          // cant use this method
          System.out.println("num = " + num);
      }

        StringBuilder s = new StringBuilder();
        for(int i:digits){
            s.append(i);
        }
//        System.out.println(Integer.parseInt(s.toString()));


      ans = num+1;

     int[] ansArr = Long.toString(ans).chars().map(c-> c-'0').toArray();

        return ansArr;
    }

 */

        int last = digits.length;
        for(int i=last-1;i>=0;i--){ //loop backward of the array
            if(digits[i]<9){  // if there is no digit 9, then increase the last element by 1 - PLUS ONE!
                digits[i]++;
                return digits;
            }
            digits[i]=0;     // any 9 we see, we make it to 0

        }
        //if all digits are 9, {9,9,9}, then create new array and make its 1st element to 1, {1,0,0,0}

        int[] new_array = new int[last+1];
        new_array[0]=1;
        return new_array;


    }
}


