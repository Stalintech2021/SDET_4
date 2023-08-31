package week2.HomeWork;/*
* Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.



Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
*
* Understood -- Yes
* Dataset -- as given
*
* ThoughtProcess
* Check if (n<3) -- return false
* Check if (n%3 == 0) -- return false
* int temp = n/3
* check if (temp%3 == 0)
*
*
*
* Pseudocode:1.

* */

import org.testng.annotations.Test;

public class PowerOfThree {

    @Test
    public void test2(){
        int n = 27;
        boolean check = checkCube(n);


    }
    public boolean checkCube(int n){

        while (n%3 == 0){
            n = n/3;
        }
        return n==1;

    }
}
