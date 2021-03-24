package com;

public class AddBinary_67 {

    /*
       67. Add Binary
    https://leetcode.com/problems/add-binary/submissions/

     */

    public String addBinary(String a, String b) {
/*
Convert to number method will fails for large input :
    a= "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    b= "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"

 */

        /*
        String ans  = "";
        double  value = 0;
        for(int i =0;i<a.length();i++){
            System.out.println("i position = " + i );
            System.out.println("a.charAt = " + a.charAt(i));
        if(a.charAt(i)=='1') {
            System.out.println("square = " + Math.pow(2, a.length() - i - 1));
            value=value+Math.pow(2, a.length() - i - 1);
        }
        }

        for(int i =0;i<b.length();i++){
            System.out.println("i position = " + i );
            System.out.println("b.charAt = " + b.charAt(i));
            if(b.charAt(i)=='1') {
                System.out.println("square = " + Math.pow(2, b.length() - i - 1));
                value=value+Math.pow(2, b.length() - i - 1);
            }
        }

        // base 10 into base 2 (binary)

        int intValue = (int) value;
        ans = Integer.toString(intValue,2);
        System.out.println("convert to base 2 = " + ans) ;

        System.out.println("ans = " + value);

         */
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;  // loop backward for a
        int j=b.length()-1;  // loop backward for b
        int carry=0;

        while(i>=0||j>=0){
            int sum = carry;
            if(i>=0) {sum+=a.charAt(i) - '0';} // convert character into int
            if(j>=0) {sum+=b.charAt(j) - '0';}
            sb.append(sum %2);
            /*
            a = "11"
            b = " 1"
            line 50 = since last char for a is 0, sum is 1 now
            line 51 = since last char for b is 0, sum = sum+1 = 2 now
            so we need to append the current index to 0, so 2%2 = 0; then we need to carry 1

            SO: index = last index
            a = "11"
            b = " 1"

            1 + 1 = 2, in binary we need to carry
             */

            carry = sum/2; // carry 1 into next index

            i--;
            j--;

        }
        //append put character at the end, so the answer need to reverse
        //a="11",b="1"
        // sb = 001 -> 100

        if(carry!=0) sb.append(carry);  // if carry left at the end of the loop, add the carry to the end
        return sb.reverse().toString();

}

}
