/*
* Given an integer n, return the number of prime numbers that are strictly less than n.
*
* Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*
* Example 2:

Input: n = 0
Output: 0
*
* Example 3:

Input: n = 1
Output: 0
*
* Understood -- Yes
* Dataset -- As given
*
* Pseudocode: 1. Get the integer n
* 2. Iterate from 1 to 10
* 3. i=1,2,3,4,5,6,7,8,9,10 -- if n%i == 0 -- It is not prime
* 4. Increment the counter in the else and return the counter
*
* 1. n%
*
*
* */


import org.testng.Assert;
import org.testng.annotations.Test;

public class CountPrimes_2 {

    /*@Test
    public void test1(){

        int n =10;
        int output = 4;
        int actual = countPrimes(n);
        Assert.assertEquals(actual, output);
    }*/
    @Test
    public void test2(){

        int n =5;
        int output = 2;
        int actual = countPrimes(n);
        Assert.assertEquals(actual, output);
    }

    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int count =0;
        int flag =0;
        for(int i=1;i<=n-1;i++){
            int nu =i;
            for(int j=2;j<=nu-1;j++){
                if(nu%j !=0){
                    count++;
                    break;
                }else{
                    break;
                }
            }
        }
        return count+1;
    }
}
