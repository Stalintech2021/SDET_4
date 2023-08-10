/*
* Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.


Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
*
* Understood -- Yes
* Dataset -- As given
*
* Pseudocode:1. Get the number
* 2. Check if the number is odd or even
* 3. If even return the number itself
* 4. If odd multiply by 2 and return
*
* */

import org.testng.annotations.Test;

public class SmallestEvenMultiple {
    @Test
    public void test1(){

        int n = 5;
        int output =0;

    }


    public int smallestEvenMultiple(int n) {

        int sum =0;
        int[] a = {1,15,6,3};
        for(int i =0;i<a.length;i++){
            String s = Integer.toString(a[i]);
            if(s.length() > 1){

            }
            sum = sum+a[i];
        }
        System.out.println(sum);

        if(n % 2 ==0){
            return n;
        }else{
            return n *2;
        }





    }
}
