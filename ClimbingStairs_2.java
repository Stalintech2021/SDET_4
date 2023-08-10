/*
* You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
*
* 1 <= n <= 45
*
* Understand - Yes
* Datasets -- as given
*
* ThoughtProcess: To reach the nth step I have to do either
* Step from (n-1)th step to nth step
* OR
* Step from (n-2)th step to nth step
* ///y going backwards I would have used either (n-2) or (n-1)
* Hence the total number of ways would be a summation of (n-2) & (n-1) ways
*
* Pseudocode:1. Get the number of steps n
* 2. if n < 2; return 1
* 3. else return getWays(n-2)+getWays(n-1) -- This will execute in recursion until the n <2
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClimbingStairs_2 {

    @Test
    public void test1(){

        int n = 2;
        int output =2;
        int actual =getWays(n);
        Assert.assertEquals(actual, output);

    }

    @Test
    public void test2(){

        int n = 2;
        int output =2;
        int actual =getWays(n);
        Assert.assertEquals(actual, output);

    }

    public int getWays(int n){

        if(n < 2){
            return 1;
        }
        return getWays(n-1)+getWays(n-2);
    }
}
