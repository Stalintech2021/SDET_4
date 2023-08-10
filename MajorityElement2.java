import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MajorityElement2 {

    @Test
    public void test1(){
        int[] nums = {3,2,3};
        int majElement = getMajElement(nums);
        Assert.assertEquals(3,majElement);

    }

    public int getMajElement(int[] nums){

        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<nums.length-1;i++){
            int counter =1;

                if(nums[i] == nums[i+1]){
                    counter++;
                    if(counter > n/2){
                        System.out.println("The majority element "+nums[i]);
                        return nums[i];
                    }
                }


        }

        return 0;
    }

}
