package com.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class M763_PartitionLabels {
    public List<Integer> partitionLabels(String s) {


        char [] cArray = s.toCharArray();

        if(cArray.length==1){
            return new ArrayList<Integer>(1);
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
        }


        for(int i = 0;i<cArray.length;i++){
            if(map.containsKey(cArray[i])){
                System.out.println("index = " + i);
            }

        }



        System.out.println("map = " + map );

        return null;


    }
}
