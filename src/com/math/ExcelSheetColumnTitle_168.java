package com.math;

/*
168. Excel Sheet Column Title
https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int columnNumber) {
       StringBuilder sb = new StringBuilder();
       String ans = "";
       while(columnNumber>0){

           columnNumber -= 1;

           sb.append((char)('A' + columnNumber%26));
           System.out.println("sb = " +sb.toString());
           columnNumber /= 26;


       }
        ans = sb.reverse().toString();
        System.out.println("ans = " + sb.reverse().toString());

        return ans;
    }
}
