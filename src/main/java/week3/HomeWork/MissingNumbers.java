package week3.HomeWork;/*
* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*
* Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*
*
* Understood -- Yes
* Datasets -- as given
*
* Pseudocode: 1. Get the array, and n
*
* 2. Iterate from 0-n and check if the array contains value of 'i'
* 3. Return the value not in the array
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingNumbers {

    @Test
    public void test1(){
        int[] nums = {3,0,1}; //0,1,3
        int output = 2;
        int n =3;
        int actual = checkMissingNo(nums, n);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){
        int[] nums = {0,1}; //0,1,3
        int output = 2;
        int n =2;
        int actual = checkMissingNo(nums, n);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test3(){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int output = 8;
        int n =9;
        int actual = checkMissingNo(nums, n);
        Assert.assertEquals(actual, output);

    }

    public int checkMissingNo(int[] nums, int n){

        int[] arr = new int[n+1]; // 0,0,0,0
        for (int a:nums) {
            arr[a]++;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) return i;

        }
        return 0;
    }
}
