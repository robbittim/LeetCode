package com;

/*
13. Roman to Integer

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

Idea:
Regular IV=1+5 = 6;          Roman IV=4,         diff 2
Regular IX=1+10 = 11;        Roman IX=9,         diff 2
Regular XL=10+50 = 60;       Roman XL=40,        diff 20
Regular XC=10+100 = 110;     Roman XC=90,        diff 20
Regular CD=100+500 = 600;    Roman CD=400,       diff 200
Regular CM=100+1000 = 1100;  Roman CM=900,       diff 200

 */

public class RomanToInteger {

    public int romanToInt(String s) {
        int ans =0;
     for(int i = 0; i<s.length();i++){

           System.out.println(s.charAt(i));
//         System.out.println("i value = " + i);
         System.out.println("ans value = " +   ans);
            switch (s.charAt(i)){
                case 'I':
                    ans +=1;
                   break;
                case 'V':
                    ans+=5;
                    if( i>0 && s.charAt(i-1) =='I') {
                        ans-=2;
                        break;
                    }
                   break;
                case 'X':
                    ans +=10;
                    if(i>0 && s.charAt(i-1) =='I') {
                        ans-=2;
                        break;
                    }
                    break;
                case 'L':
                    ans +=50;
                    if(i>0 &&s.charAt(i-1) =='X') {
                        ans -=20;
                        break;
                    }
                    break;
                case 'C':
                    ans +=100;
                    if(i>0 &&s.charAt(i-1) =='X') {
                        ans -=20;
                        break;
                    }
                    break;
                case 'D':

                        ans +=500;
                    if(i>0 &&s.charAt(i-1) =='C') {
                        ans -=200;
                        break;
                    }
                    break;
                case 'M':
                        ans+=1000;
                    if(i>0 &&s.charAt(i-1) =='C') {
                        ans -=200;
                        break;
                    }

                    break;

            }

       }
        System.out.println(ans);
        return ans;
    }
}
