package com.math;

import java.util.HashMap;
import java.util.Map;
/*
405. Convert a Number to Hexadecimal
https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 */
public class Base16_405 {

    public String toHex(int num) {

        /*
        if(num == 0 ) return "0";

        Map<Integer,String> map = new HashMap<>();
        map.put(10,"A");
        map.put(11,"B");
        map.put(12,"C");
        map.put(13,"D");
        map.put(14,"E");
        map.put(15,"F");

        StringBuilder sb = new StringBuilder();

        while(num>0){
            int mod = num%16;

            if(map.containsKey(mod)){
                sb.append(map.get(mod));
            }else {
                sb.append(mod);
            }

            num = num /16;

        }
        System.out.println(sb.reverse().toString().toLowerCase());

        String ans = sb.reverse().toString().toLowerCase();


         */
        if(num == 0 ) return "0";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();

        while(num!=0){
            // 0xF = 0000 0000 0000 0000 0000 0000 0000 1111
            int temp = num & (0xF);
            sb.append(hex[temp]);
            num >>>=4; //// 因为考虑的是补码形式，因此符号位就不能有特殊的意义，需要使用无符号右移，左边填 0
        }

        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();

        //return Integer.toString(num,16);
    }



}
