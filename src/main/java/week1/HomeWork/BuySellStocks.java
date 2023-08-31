package week1.HomeWork;/*
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


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuySellStocks {

    @Test
    public void test1(){

        int[] prices = {7,1,5,3,6,4};
        int expected =5;

        int actual = bestSale(prices);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test2(){

        int[] prices = {7,6,4,3,1};
        int expected =0;

        int actual = bestSale(prices);
        Assert.assertEquals(actual, expected);

    }

    public int bestSale(int[] prices){

        int bestProfit =0;
        List<Integer> profits1 = new ArrayList<Integer>();
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] < prices[j]){
                    profits1.add(prices[j]-prices[i]);
                }
                Collections.sort(profits1);

            }

        }
        if(profits1.size() !=0){
            bestProfit = profits1.get(profits1.size()-1);
        }
        return bestProfit;
    }
}

/*Pseudocode
1. Get the int[] prices
2. Declare a List 'profits'
3. iterate the int[] through for loop int i=0
4. iterate the int[] through for loop int j=i+1
5. if prices[i] < prices [j]
6. profits.add (prices[j] - prices [i])
7. Come out of the j loop
8. Sort the profits
9. if profits.size !=0 ; return last element of profits
* */
