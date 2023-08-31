package week3.HomeWork;/*
* You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".
*
* Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
*
* Understood -- Yes
* Datasets -- as given
*
* Pseudocode: 1. Get the strings 'jewels' 'stones'
* Create a regex with jewels and do replaceAll in stones
*
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelsnStones {

    /*@Test
    public void test1(){

        String jewels = "z";
        String stones = "ZZ";
        int actual = checkOccurence(jewels, stones);
        Assert.assertEquals(actual, 0);

    }*/
    @Test
    public void test2(){

        String jewels = "aA";
        String stones = "aAAbbbb";
        int actual = checkOccurence(jewels, stones);
        Assert.assertEquals(actual, 3);

    }

    public int checkOccurence(String jewels, String stones){

        stones = stones.replaceAll("[^123]", "");
//        stones = stones.replaceAll("[^aA]", "");
        System.out.println(stones);

        return stones.length();
    }

}
