package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuySellStocks_22 {

    @Test
    public void test1(){
        int[] prices = {7,1,5,3,6,4};
        int output = 5;
        int actual = maxProfit(prices);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int[] prices = {7,6,4,3,1};
        int output = 0;
        int actual = maxProfit(prices);
        Assert.assertEquals(actual, output);
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j< prices.length;j++){
                if(prices[i] < prices[j]){
                    profit = prices[j] - prices[i];
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }
}
