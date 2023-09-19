package week10;

/*
* Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayyParity {

//    @Test
    public void test1(){
        int[] nums = {3,1,2,4};
        int[] exp = {4,2,1,3};
        int[] actual = sortArrayByParity(nums);
        Assert.assertEquals(actual, exp);

    }
//    @Test
    public void test2(){
        int[] nums = {0};
        int[] exp = {0};
        int[] actual = sortArrayByParity(nums);
        Assert.assertEquals(actual, exp);

    }
//    @Test
    public void test3(){
        int[] nums = {80,453,3994,5999};
        int[] exp = {80,3994,453, 5999};
        int[] actual = sortArrayByParity(nums);
        Assert.assertEquals(actual, exp);

    }
    @Test
    public void test4(){
        int[] nums = {-1};
        int[] exp = {-1};
        int[] actual = sortArrayByParity(nums);
        Assert.assertEquals(actual, exp);

    }

    public int[] sortArrayByParity(int[] nums) {

        if(nums.length == 1) return nums;
        int i=0;
        for(int j= nums.length-1;j>0;j--){
            if(i>j) break;
            try{
                if(nums[i] < 0 || nums[j] < 0);
            }catch(Exception e){
                System.out.println("Invalid Input");
            }

            if (nums[i]%2 !=0 && nums[j]%2 ==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }else if(nums[i]%2 !=0 && nums[j]%2 !=0){
                continue;
            }
            else if(nums[i]%2 ==0 && nums[j]%2 ==0){
                i++;
                j++;
            }
            else if(nums[i]%2 ==0 && nums[j]%2 !=0){
                continue;
            }

        }
        return nums;
    }
}
