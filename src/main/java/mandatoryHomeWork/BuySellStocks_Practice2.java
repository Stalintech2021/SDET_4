package mandatoryHomeWork;/*
* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*
*
*
* Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*
*
* Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
* */

/*Understood the issue -- Yes

Datasets -- As given above

Pseudocode:
1. Declare int maxProfit =0
2. Iterate the array in a for loop int i
3 Check if current day price is greater than  the next day price -- int[i] > int [i+1]
4. If yes break and skip to next day -- iterate to i+1
5. int diff = int[i+1] - int[i]
6. if diff > maxProfit; maxProfit = diff;
7. return maxProfit
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuySellStocks_Practice2 {

    @Test
    public void test1(){
        int[] prices = {7,1,5,3,6,4};
        int output = 5;
        int maxProfit = getMaxProfit(prices);
        Assert.assertEquals(maxProfit, output);

    }
    @Test
    public void test2(){
        int[] prices = {7,6,4,3,1};
        int output = 0;
        int maxProfit = getMaxProfit(prices);
        Assert.assertEquals(maxProfit, output);

    }

    public int getMaxProfit(int[] prices){

        int maxProfit = 0;
        int diff = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                while(prices[i] < prices[j]){
                    diff = prices[j]- prices[i];
                    if(diff > maxProfit){
                        maxProfit = diff;
                    }
                    break;
                }
            }
        }
        return maxProfit;
    }
}
