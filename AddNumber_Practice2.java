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
* 1. Get the number,
* 2. Divide it by 10 ; Modulo by 10
* 3. n = n/10 + (n%10)
* 4. Do the operation until n <10
* return n
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNumber_Practice2 {

    @Test
    public void test1(){

        int input = 38;
        int output = 2;
        int actual = getCount(input);
        System.out.println(actual);
        Assert.assertEquals(actual, output);
    }

    @Test
    public void test2(){

        int input = 729;
        int output = 9;
        int actual = getCount(input);
        Assert.assertEquals(actual, output);
    }

    @Test
    public void test3(){

        int input = 100;
        int output = 1;
        int actual = getCount(input);
        Assert.assertEquals(actual, output);
    }

    public int getCount(int input){

        if(input == 0) return input;

        if(input == 100) return input/100;

        while(input >  100){

            int next = input/10;
            input = next/10 + next%10 + input%10;
            if(input >9){
                input = input/10 + input%10;
            }
            return input;
        }

        while(input > 9 && input <100){
            input = input/10 + input%10;

        }

        return input;
    }
}
