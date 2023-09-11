package week8;

/*
* A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].



Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.

* */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class HeightChecker {

    @Test
    public void test1(){

        int[] heights = {1,1,4,2,1,3};
        int actual = heightChecker(heights);
        Assert.assertEquals(actual, 3);

    }
    @Test
    public void test2(){

        int[] heights = {5,1,2,3,4};
        int actual = heightChecker(heights);
        Assert.assertEquals(actual, 5);

    }
    @Test
    public void test3(){

        int[] heights = {1,2,3,4,5};
        int actual = heightChecker(heights);
        Assert.assertEquals(actual, 0);

    }
    @Test
    public void test4(){

        int[] heights = {97,63,82,13,1};
        int actual = heightChecker(heights);
        Assert.assertEquals(actual, 5);

    }
    @Test
    public void test5(){

        int[] heights = {88,2,1,4,76};
        int actual = heightChecker(heights);
        Assert.assertEquals(actual, 4);

    }

    public int heightChecker(int[] heights) {

        int count =0;
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            if(heights[i] == arr[i]){
                continue;
            }else{
                count++;
            }
        }
        return count;
    }
}
