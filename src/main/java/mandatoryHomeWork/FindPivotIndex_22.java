package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindPivotIndex_22 {

    @Test
    public void test1(){
        int[] nums = {1,7,3,6,5,6};
        int output = 3;
        int actual = pivotIndex(nums);
        Assert.assertEquals(actual, output);
    }

    public int pivotIndex(int[] nums) {
        int pivot = 0;
//        int[] leftSum = new int[nums.length];
//        int[] rightSum = new int[nums.length];

        int leftSum = 0;
        int rightSum = 0;


        for(int i=0;i<nums.length;i++){
            leftSum = 0;
            rightSum = 0;

            for(int j=0;j< nums.length;j++){
                if(j<i) leftSum = leftSum +nums[j];
                if(j>i) rightSum = rightSum +nums[j];

            }
            if(leftSum == rightSum){
                return i;
            }

        }


        return -1;
    }
}
