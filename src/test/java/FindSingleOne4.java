import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class FindSingleOne4 {


    @Test
    public void checkSingleOne(){

        int[] nums = {4,1,2,1,2};

        findSingle(nums);
    }

    public void findSingle(int[] nums){

        int iterator = 0;
        Arrays.sort(nums); //{1,1,2,2,4}

        for(int i=1;i<=nums.length;i++){

            if(nums[i] != nums[i+1]){

                System.out.println("Not Single");
                i++;
            }
            if(i == nums.length-2) {
                System.out.println("Single is " + nums[i]);
                break;
            }
        }

    }
}
