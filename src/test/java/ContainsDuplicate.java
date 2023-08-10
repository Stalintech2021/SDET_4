import org.testng.annotations.Test;

import java.util.Arrays;

public class ContainsDuplicate {

    @Test
    public void test1(){

        int[] nums = {1,2,3,1};
        checkContainsDuplicate(nums);
    }

    @Test
    public void test2(){

        int[] nums = {1,2,3,4};
        checkContainsDuplicate(nums);
    }

    @Test
    public void test3(){

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        checkContainsDuplicate(nums);
    }

    public boolean checkContainsDuplicate(int[] nums){

        Arrays.sort(nums);
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if (nums[i] == nums[i+1]){
                    return true;
                }
            }
        }return false;

    }
}
