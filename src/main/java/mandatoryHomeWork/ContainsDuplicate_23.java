package mandatoryHomeWork;/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContainsDuplicate_23 {

    @Test
    public void test1(){
        int[] nums = {1,2,3,1};
        boolean actual = containsDuplicate(nums);
        Assert.assertTrue(actual);
    }
    @Test
    public void test2(){
        int[] nums = {1,2,3,4};
        boolean actual = containsDuplicate(nums);
        Assert.assertFalse(actual);
    }
    @Test
    public void test3(){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean actual = containsDuplicate(nums);
        Assert.assertTrue(actual);
    }


    public boolean containsDuplicate(int[] nums) {
        boolean contains = true;
        int count =1;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        if(count ==1){
            contains = false;

        }


        return contains;
    }
}
