package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class FindSingleOne3 {

    @Test
    public void test1(){

        int[] nums = {4,1,2,1,2};
        int actual = findSingle(nums);
        Assert.assertEquals(actual, 4);

    }

    public int findSingle(int[] nums){

        HashSet<Integer> set = new HashSet<Integer>();

        for (Integer num:nums) {

            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
         return set.iterator().next();

    }
}
