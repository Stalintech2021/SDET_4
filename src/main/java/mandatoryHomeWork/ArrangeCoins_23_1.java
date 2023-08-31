package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
* You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins.
* The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.
*
* Example 1:
* Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
*
* Example 2:
* Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
* */
public class ArrangeCoins_23_1 {

    @Test
    public void test1(){
        int n = 5;
        int output = 2;
        int actual = arrangeCoins(n);
        Assert.assertEquals(actual, output);

    }

    public int arrangeCoins(int n) {
        int steps = 0;
        if(n==1) steps =1;
        if(n>1) {

        }


        return steps;
    }
}


/*
* {
		int steps = 0;
		for (int i=1; i<=coins; i++)
		{
			steps++;
			coins = coins-steps;

		}

		return steps;

	}
* */
