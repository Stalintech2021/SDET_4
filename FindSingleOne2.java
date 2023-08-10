import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class FindSingleOne2 {


    @Test
    public void checkSingleOne(){

        int[] nums = {4,1,2,1,2};

        findSingle(nums);
    }

    public void findSingle(int[] nums){

        Arrays.sort(nums); //{1,1,2,2,4}

        for(int i=0;i<=nums.length-1;i++){

            if(nums[i] != nums[i+1]){

                System.out.println("Single is " + nums[i]);

            }

        }

    }
}
