/*Arrange Coins
*
* Did I understand the problem -- Yes
*
* DataSet -- as given in the test
*
* Pseudocode:
* 1. Start from row 1 // (i=1), eg n=5 (considering step as i)
* 2.while (n > 0) // n-1 -- i.e 4
*       increment step // -- i++ i.e i=2
*       subtract the number of steps from n // n-i i.e 4-2 =2
* return i-1 (step - 1)
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrangeCoins {

    @Test
    public void test1(){

        int coins = 7;
        int rows = arrCoins(coins);
        Assert.assertEquals(rows, 3);
    }

    @Test
    public void test2(){

        int coins = 2;
        int rows = arrCoins(coins);
        Assert.assertEquals(rows, 1);
    }

    public int arrCoins(int coins) {

        int step =0;

        while (coins > 0){
            step++;
            coins = coins-step;
        }
        return step-1;
    }
}
