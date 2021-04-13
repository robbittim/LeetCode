package com.hashtable;

/*
204. Count Primes
https://leetcode.com/problems/count-primes/submissions/
 */
public class CountPrimes_204 {

    public int countPrimes(int n) {

        if(n<2) return 0;

        boolean sieve[ ] = new boolean[n+1];

        for(int i =2; i<n;i++){
            sieve[i] = true;
        }

        int count = 0;

        for(int i =2;i<Math.sqrt(n);i++){   // for i=2,3,4,5,....., Sqrt(n)
            if(sieve[i]==true){
                for(int j = i*i;j<n;j=j+i){ // for j = i^2, i^2+i, i^2+2i, ...... , n
                    sieve[j] = false;

                }
            }
        }

        for(int i = 2; i < n; i++){
            if(sieve[i])
                count++;
        }
        System.out.println(count);

        return count;

    }
}
