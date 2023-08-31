package week2.HomeWork;/*
*
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquaresOfSortedArray {

    @Test
    public void test1(){
        int[] nums = {-4,-1,0,3,10};
        int[] output = {0,1,9,16,100};
        int[] actual = sortedArray(nums);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int[] nums = {-7,-3,2,3,11};
        int[] output = {4,9,9,49,121};
        int[] actual = sortedArray(nums);
        Assert.assertEquals(actual, output);
    }

    public int[] sortedArray(int[] nums){

        for(int i=0;i<nums.length;i++){
            int temp = nums[i]*nums[i];
            nums[i] = temp;
            temp =0;
        }

        //to sort the array
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp =0;
                if(nums[i] > nums[j]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    temp = 0;

                }

            }

        }
        return nums;
    }
}
