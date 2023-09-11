package week8;

/*
* You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.



Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false


Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class CanPlaceFlowers {

    @Test
    public void test1(){

        int[] flowerbed = {1,0,0,0,1};
        int n=1;
        boolean actual = canPlaceFlowers(flowerbed, n);
        Assert.assertTrue(actual);
    }
    /*@Test
    public void test2(){

        int[] flowerbed = {0,0,1};
        int n=2;
        boolean actual = canPlaceFlowers(flowerbed, n);
        Assert.assertFalse(actual);
    }
    @Test
    public void test3(){

        int[] flowerbed = {1,0,1};
        int n=2;
        boolean actual = canPlaceFlowers(flowerbed, n);
        Assert.assertFalse(actual);
    }
    @Test
    public void test4(){

        int[] flowerbed = {1,0,0,0,0,1};
        int n=2;
        boolean actual = canPlaceFlowers(flowerbed, n);
        Assert.assertFalse(actual);
    }
    @Test
    public void test5(){

        int[] flowerbed = {1,0,0,0,0,0};
        int n=2;
        boolean actual = canPlaceFlowers(flowerbed, n);
        Assert.assertTrue(actual);
    }*/

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count =0;
        for(int i=1;i<flowerbed.length-1;i++){
            int prev = (i == 0 || flowerbed[i-1] == 0) ? 0:1;
            int next = (flowerbed[i+1] == 0 || i == flowerbed.length-1) ? 0:1;

            if(prev == 0 && next==0){
                flowerbed[i] = 1;
                count++;
            }

        }
        return count==n;
    }
}