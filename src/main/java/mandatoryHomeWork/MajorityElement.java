package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityElement {

    /*@Test
    public void test1(){
        int[] nums = {3,2,3};
        int majElement = getMajElement(nums);
        Assert.assertEquals(majElement,3);

    }*/

    @Test
    public void test2(){
        int[] nums = {1};
        int majElement = getMajElement(nums);
        Assert.assertEquals(majElement,1);

    }

    /*@Test
    public void test2(){

        int[] nums = {2,2,1,1,1,1,1,2,2};
        int majElement = getMajElement(nums);
        Assert.assertEquals(majElement,1);

    }*/

    public int getMajElement(int[] nums){

        int n = nums.length;
        int majElement = 0;

        if(n == 1){
            majElement = nums[0];
            return majElement;
        }

        for(int i=0;i<n-1;i++){
            int counter =1;
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    counter++;
                    if(counter > n/2){
                        System.out.println("The majority element "+nums[i]);
                        majElement = nums[i];
                        return majElement;
                    }
                }

            }
        }

        return majElement;
    }

}
