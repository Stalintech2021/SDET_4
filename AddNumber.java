/*
* Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*
*
* Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
*
* Yes
* Dataset as is
*
* Pseudocode:
* 1. Get the integer n=38;
* 2. int get = 0;
* 3. while n > 0
* 4.
* 5. n = n/10+n%10
* 6.
* */


import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNumber {

    @Test
    public void test1(){

        int n = 38;
        int output = 2;
        int num = getFinal(n);
        Assert.assertEquals(num, output);
    }
    @Test
    public void test2(){

        int n = 0;
        int output = 0;
        int num = getFinal(n);
        Assert.assertEquals(num, output);
    }

    public int getFinal(int n){

        if(n == 0){
            return n;
        }

        while(n > 0){
            n = n/10+(n%10);
            if(n<10){
                break;
            }
        }

        return n;

    }
}
