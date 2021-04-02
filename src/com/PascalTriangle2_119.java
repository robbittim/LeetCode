package com;

import java.util.ArrayList;
import java.util.List;

/*
119. Pascal's Triangle II
https://leetcode.com/problems/pascals-triangle-ii/
 */

public class PascalTriangle2_119 {


    public List<Integer> getRow(int rowIndex) {
        //index is numberOfRow -1 in the triangle
        //get the complete triangle with rowIndex + 1
        //then return the row with passed in rowIndex
        List<List<Integer>> ans = generate(rowIndex+1);

        return ans.get(rowIndex);


    }

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        //base case, if numberOfRows is 0, then return empty row
        if(numRows==0){
            return  ans;
        }
        //base case 2, the 1st row of the triangle is always 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);

        System.out.println("firstRwo = " + firstRow.toString());

        for(int i =1;i<numRows;i++) {
            //get the previous row, so we can calculate the sum from previous row
            List<Integer> previous_row = ans.get(i - 1);

            List<Integer> current_row = new ArrayList<>();

            //The first element in each row is always 1
            current_row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the left element of previous row and
            // right element of previous row.
            for (int j = 1; j < i; j++) {

                current_row.add(previous_row.get(j - 1) + previous_row.get(j));
                System.out.println("current row value= " + current_row.toString() + " with j value = " + j );
            }

            //The last element in each row is always 1
            current_row.add(1);
            ans.add(current_row);
//            System.out.println("ans row after add = " + ans.toString());

        }


        return ans;
    }


}
