package com.math;

/*
171. Excel Sheet Column Number
https://leetcode.com/problems/excel-sheet-column-number/submissions/
 */
public class ExcelSheetColumnNumber_171 {

    public int titleToNumber(String columnTitle) {

        /*
        base-10
        52 = 5 * 10^1 + 2 * 10^0.

        we have the base-26 numeral system, so we can calculate as

        AB = A * 26^1 + B * 26^0.

        Where 'A', 'B' and other letters can be converted bases on the ASCII table.
        The 'A' letter has 65 code in the ASCII table therefore
        we have to subtract 64 to convert the letter to the correspondning number. In other words

        AB = (65 - 64) * 26^1 + (66 - 64) * 26^0 = 1 * 26 + 2 * 1 = 28.
         */
        final int BASE = 26;
        final int ASCII_OFFSET = 64;
        int number = 0;

        for (int i = 0; i < columnTitle.length(); ++i) {
            int code = columnTitle.charAt(columnTitle.length() - i - 1) - ASCII_OFFSET;

            System.out.println("int code = " + code );

            System.out.println(columnTitle.charAt(columnTitle.length() - i - 1));
            number += code * Math.pow(BASE, i);
            System.out.println("number = " + number);
        }

        return number;

    }


}
