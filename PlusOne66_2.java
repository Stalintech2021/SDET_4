/*
* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*
*
* Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*
* Understood -- Yes
* Datasets -- As given
*
* Pseudocode: 1. Get the array
* 2. Get the first
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusOne66_2 {

    @Test
    public void test1(){

        int[] input = {1,2,3};
        int[] output = {1,2,4};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test3(){

        int[] input = {9,8,7,6,5,4,3,2,1,0};
        int[] output = {9,8,7,6,5,4,3,2,1,1};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }@Test
    public void test4(){

        int[] input = {4,3,2,1};
        int[] output = {4,3,2,2};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }@Test
    public void test5(){

        int[] input = {9};
        int[] output = {1,0};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){

        int[] input = {9,9};
        int[] output = {1,0,0};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }

    public int[] plusOne(int[] digits) {

        String s = "";
        Long res =Long.MAX_VALUE;
        for(int i=0;i<digits.length;i++) {
            s = s+Integer.toString(digits[i]);
//            res = res * 10 + digits[i];

        }
        res = Long.parseLong(s);
        res++;
        String[] str = new String[digits.length];
        str = Long.toString(res).split("");
        if(str.length > digits.length){
            int[] arr = new int[digits.length+1];
            for (int i=0;i<str.length;i++){
                arr[i] = Integer.parseInt(str[i]);
            }return arr;
        }else {
            int[] arr = new int[digits.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }return arr;
        }
    }
}
