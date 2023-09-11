package week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SetMismatch {

    @Test
    public void test1(){
        int[] nums = {1,2,2,4};
        int[] actual = findErrorNums(nums);
        int[] expected = {2,3};
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2(){
        int[] nums = {1,1};
        int[] actual = findErrorNums(nums);
        int[] expected = {1,2};
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test(){
        int[] nums = {1,2,3,4,4};
        int[] actual = findErrorNums(nums);
        int[] expected = {4,5};
        Assert.assertEquals(actual, expected);
    }

    public int[] findErrorNums(int[] nums) {

        int[] missing = new int[2];
        for(int i=0;i< nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                missing[0] = nums[i];
                missing[1] = nums[i]+1;
                break;
            }
        }
        return missing;

    }
}
